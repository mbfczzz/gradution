package jz.cdgy.msg.Service;

import jz.cdgy.msg.Dto.MsgDto;

import javax.mail.MessagingException;
import java.util.List;

public interface NotifyService {
        <T> void SendEmail(List<Integer> id,Class<T> clazz) throws MessagingException;

        void activeSendEmail(List<Integer> ids,Integer mid);

        List<MsgDto> getAllNotify(Integer page,Integer limit,MsgDto msgDto);
}
