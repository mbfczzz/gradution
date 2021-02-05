package jz.cdgy.admin.message.impl;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rabbitmq.client.Channel;
import jz.cdgy.admin.message.RabbitLogMessage;
import jz.cdgy.admin.service.LogService;
import jz.cdgy.common.Utils.JsonUtil;
import jz.cdgy.common.exception.ParamException;
import jz.cdgy.common.model.esLog;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@EnableRabbit
@Component
@Slf4j
public class RabbitLogMessageImpl  implements RabbitLogMessage {
    @Autowired
    private LogService logService;
    @Autowired
    private ObjectMapper objectMapper;

    @Override
    @RabbitListener(queues = "admin-log-queue")
    public void handlerLogMessage(Message message, Channel channel) throws IOException {
        try {
            esLog es = objectMapper.readValue(new String(message.getBody()),esLog.class);
            logService.addLog(es);
            log.info("aop日志收集");
        }
        catch (Exception e){
            log.error(e.getLocalizedMessage()+e.getStackTrace()+e.getMessage()+e.getCause());
            log.info("消息发送失败!");
        }
    }
}
