package jz.cdgy.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import jz.cdgy.admin.service.SpendWayService;
import jz.cdgy.admin.util.AssertsUtil;
import jz.cdgy.mbg.mapper.SpendWayMapper;
import jz.cdgy.mbg.pojo.Rewards;
import jz.cdgy.mbg.pojo.SpendWay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
public class SpendWayServiceImpl implements SpendWayService {
    @Autowired
    private SpendWayMapper spendWayMapper;

    @Override
    public List<Map<String, Object>> getSpendWay() {
        QueryWrapper<SpendWay> queryWrapper = new QueryWrapper();
        queryWrapper.select("id as value","way_name as label");
        queryWrapper.eq("is_valid",1);
        return spendWayMapper.selectMaps(queryWrapper);
    }

    @Override
    public PageInfo<SpendWay> getAllSpendWay(Integer page, Integer limit, SpendWay spendWay) {
        PageHelper.startPage(page,limit);
        return new PageInfo<SpendWay>(spendWayMapper.selectList(new QueryWrapper<SpendWay>()));
    }

    @Override
    public void addSpendWay(SpendWay spendWay) {
        AssertsUtil.isTrue(spendWayMapper.insertSelective(spendWay)!=1,"添加失败!");
    }

    @Override
    @Transactional
    public void deleteSpendWay(List<Integer> id) {
        AssertsUtil.isTrue(spendWayMapper.deleteBatchIds(id)!=1,"删除失败!");
    }

    @Override
    public void updateSpendWay(SpendWay spendWay) {
        AssertsUtil.isTrue(spendWayMapper.updateByPrimaryKeySelective(spendWay)!=1,"更新失败!");
    }
}
