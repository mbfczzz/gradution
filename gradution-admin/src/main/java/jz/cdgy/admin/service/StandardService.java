package jz.cdgy.admin.service;

import com.github.pagehelper.PageInfo;
import jz.cdgy.mbg.pojo.Position;
import jz.cdgy.mbg.pojo.Standard;

import java.util.List;
import java.util.Map;

/**
 * @author mbfczzz
 */
public interface StandardService {
    PageInfo<Standard> getAllStandard(Integer page, Integer limit, Standard standard);

    void addStandard(Standard standard);

    void updateStandard(Standard standard);

    void deleteStandard(List<Integer> id);

    List<Map<String, Object>> getStandardType();

    List<Map<String, Object>> getStandardDescribe();

    List<Map<String, Object>> getStandardName();

    Standard getStandardByStandardName(String name);

    Standard getStandardByStandardId(String id);
}
