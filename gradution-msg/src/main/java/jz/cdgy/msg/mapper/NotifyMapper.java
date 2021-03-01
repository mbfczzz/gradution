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
}
