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

        List<Map> getMsgSource();

        List<Map> getSendSubject();

        String updateMessage(MsgDto msgDto);

        void deleteMsg(List<Integer> id);

        void checkOk(List<Integer> id);

        void msgReject(List<Integer> id);

        PageInfo<MsgDto> getAllCheckNotify(Integer page, Integer limit, MsgDto msgDto);

        PageInfo<MsgDto> getMessageByName(Integer page, Integer limit,String id);

        PageInfo<MsgDto> getMessageByUser(Integer page, Integer limit, String id);
}
