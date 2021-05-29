package jz.cdgy.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import jz.cdgy.admin.service.AgencyService;
import jz.cdgy.admin.util.AssertsUtil;
import jz.cdgy.mbg.mapper.AccountMapper;
import jz.cdgy.mbg.mapper.AgencyMapper;
import jz.cdgy.mbg.pojo.Account;
import jz.cdgy.mbg.pojo.Agency;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Map;

@Service
public class AgencyServiceImpl implements AgencyService {
    @Autowired
    private AgencyMapper agencyMapper;

    @Override
    public PageInfo<Agency> getAllAgency(Integer page, Integer limit, Agency agency) {
        PageHelper.startPage(page, limit);
        return new PageInfo<Agency>(agencyMapper.selectList(new QueryWrapper<>()));
    }

    @Override
    public void addAgency(Agency agency) {
        AssertsUtil.isTrue(agencyMapper.insertSelective(agency) != 1, "添加失败!");
    }

    @Override
    public void updateAgency(Agency agency) {
        AssertsUtil.isTrue(agencyMapper.updateByPrimaryKeySelective(agency) != 1, "更新失败!");
    }

    @Override
    @Transactional
    public void deleteAgency(List<Integer> ids) {
        AssertsUtil.isTrue(agencyMapper.deleteBatchIds(ids) != 1, "删除失败!");
    }

    @Override
    public List<Map<String, Object>> getAgencyByMap() {
        QueryWrapper<Agency> queryWrapper = new QueryWrapper();
        queryWrapper.select("id as 'key'","agency_name as 'label',0 as 'disabled'");
        return agencyMapper.selectMaps(queryWrapper);
    }
}
