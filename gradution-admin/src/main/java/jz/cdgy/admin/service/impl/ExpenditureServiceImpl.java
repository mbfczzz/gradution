package jz.cdgy.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import jz.cdgy.admin.service.ExpenditureService;
import jz.cdgy.admin.util.AssertsUtil;
import jz.cdgy.mbg.mapper.SpendMapper;
import jz.cdgy.mbg.pojo.Spend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;
import java.util.Queue;

@Service
public class ExpenditureServiceImpl implements ExpenditureService {
    @Autowired
    private SpendMapper spendMapper;
    @Override
    public PageInfo<Spend> getAllSpend(Integer page, Integer limit, Spend spend) {
        PageHelper.startPage(page,limit);
        return new PageInfo<Spend>(spendMapper.getAllSpend(spend));
    }

    @Override
    public void addSpend(Spend spend) {
        AssertsUtil.isTrue(spendMapper.insertSelective(spend)!=1,"添加失败!");
    }

    @Override
    public void updateSpend(Spend spend) {
        AssertsUtil.isTrue(spendMapper.updateByPrimaryKeySelective(spend)!=1,"更新失败!");
    }

    @Override
    @Transactional
    public void deleteSpend(List<Integer> ids) {
        AssertsUtil.isTrue(spendMapper.deleteBatchIds(ids)!=1,"删除失败!");
    }

    @Override
    public List<Map<String, Object>> getSpendItem() {
        QueryWrapper<Spend> queryWrapper = new QueryWrapper();
        queryWrapper.select("id as value","spend_item as label");
        return spendMapper.selectMaps(queryWrapper);
    }
}
