package jz.cdgy.msg.message.impl;

import cn.hutool.json.JSONUtil;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rabbitmq.client.Channel;
import jz.cdgy.msg.Email.AttachEmailSend;
import jz.cdgy.msg.Email.HtmlEmailSend;
import jz.cdgy.msg.Email.SimpleEmailSend;
import jz.cdgy.msg.Email.StaticEmailSend;
import jz.cdgy.msg.Service.NotifyService;
import jz.cdgy.msg.Service.PushService;
import jz.cdgy.msg.message.RabbitEmailMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@EnableRabbit
@Component
@Slf4j
public class RabbitMessageImpl implements RabbitEmailMessage {
    private static Map<String,Class<?>> map;

    @Autowired
    private PushService pushService;

    static {
        map = new HashMap<>();
        map.put("simple", SimpleEmailSend.class);
        map.put("html", HtmlEmailSend.class);
        map.put("static", StaticEmailSend.class);
        map.put("attach", AttachEmailSend.class);
    }

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private NotifyService notifyService;

    @Override
    @RabbitListener(queues = "admin-register-queue")
    public void handlEmailSend(Message message, Channel channel) throws IOException {
        try {
            List<Integer> ids = objectMapper.readValue(new String(message.getBody()),List.class);
            notifyService.SendEmail(ids,map.get("simple"));
            log.info("用户注册成功!");
        }
        catch (Exception e){
            log.error(e.getLocalizedMessage()+e.getStackTrace()+e.getMessage()+e.getCause());
            log.info("消息出现异常!");
        }
    }

    @Override
    @RabbitListener(queues = "msg-websocket-queue")
    public void handAnnounce(Message message, Channel channel) {
        try {
            Integer id = objectMapper.readValue(new String(message.getBody()),Integer.class);
            HashMap map = new HashMap<>(1);
            map.put("id",id);
            pushService.pushMsgToAll(JSONUtil.toJsonStr(map));
            log.info("websocket发送消息成功!");
        }
        catch (Exception e){
            log.error(e.getLocalizedMessage()+e.getStackTrace()+e.getMessage()+e.getCause());
            log.info("消息出现异常!");
        }
    }
}
