package jz.cdgy.admin.service;

import com.github.pagehelper.PageInfo;
import jz.cdgy.mbg.pojo.Emp;
import jz.cdgy.mbg.pojo.Position;

import java.util.List;
import java.util.Map;

public interface PositionService {
    PageInfo<Position> getAllPosition(Integer page, Integer limit, Position position);

    void addPosition(Position position);

    void updatePosition(Position position);

    void deletePosition (List<Integer> id);

    List<Map<String,Object>> getPositionName();
}
