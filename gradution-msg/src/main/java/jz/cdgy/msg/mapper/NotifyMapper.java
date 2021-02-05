package jz.cdgy.msg.mapper;

import jz.cdgy.msg.Dto.MsgDto;

import java.util.List;

public interface NotifyMapper {
    List<MsgDto> getAllNotify(MsgDto msgDto);
}
