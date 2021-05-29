package jz.cdgy.admin.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import jz.cdgy.admin.util.AssertsUtil;
import jz.cdgy.mbg.pojo.Agency;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

public interface AgencyService {
    PageInfo<Agency> getAllAgency(Integer page, Integer limit, Agency agency);

    void addAgency(Agency agency);

    void updateAgency(Agency agency);

    void deleteAgency(List<Integer> ids) ;

    List<Map<String, Object>> getAgencyByMap();
}
