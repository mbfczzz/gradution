package jz.cdgy.msg.mapper;

import jz.cdgy.mbg.pojo.MsgModel;
import jz.cdgy.msg.Dto.MsgDto;

import java.util.List;
import java.util.Map;

public interface NotifyMapper {
    List<MsgDto> getAllNotify(MsgDto msgDto);

    List<Map> getSendWay();

    List<Map> getNotifyTemplate();

    MsgModel getCurrentTemplate(String id);

    List<Map> getMsgSource();

    List<Map> getSendSubject();

    void updateMessage(MsgDto msgDto);

    int deleteByPrimaryKey(Integer id);

    int checkOk(Integer id);

    int msgReject(Integer id);

    List<MsgDto> getAllCheckNotify(MsgDto msgDto);

    List<MsgDto> getMessageByName(String id);

    List<MsgDto> getMessageByUser(String id);
}
