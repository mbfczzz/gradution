package jz.cdgy.msg.Service;

import com.github.pagehelper.PageInfo;
import jz.cdgy.mbg.pojo.Msg;
import jz.cdgy.mbg.pojo.MsgModel;
import jz.cdgy.msg.Dto.MsgDto;

import javax.mail.MessagingException;
import java.util.List;
import java.util.Map;

public interface NotifyService {
        <T> void SendEmail(List<Integer> id,Class<T> clazz) throws MessagingException;

        void activeSendEmail(List<Integer> ids,Integer mid);

        PageInfo<MsgDto> getAllNotify(Integer page, Integer limit, MsgDto msgDto);

        List<Map> getSendWay();

        List<Map> getNotifyTemplate();

        MsgModel getCurrentTemplate(String id);

        void sendMessage(Msg msg);
}
