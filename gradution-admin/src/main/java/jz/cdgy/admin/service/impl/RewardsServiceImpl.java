package jz.cdgy.admin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import jz.cdgy.admin.service.RewardsService;
import jz.cdgy.admin.util.AssertsUtil;
import jz.cdgy.mbg.mapper.RewardsMapper;
import jz.cdgy.mbg.pojo.Rewards;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RewardsServiceImpl extends ServiceImpl<RewardsMapper, Rewards> implements RewardsService {

    @Autowired
    private RewardsMapper rewardsMapper;
    @Override
    public PageInfo<Rewards> getAllRewards(Integer page, Integer limit, Rewards rewards) {
        PageHelper.startPage(page,limit);
        return new PageInfo<Rewards>(rewardsMapper.getAllRewards(rewards));
    }

    @Override
    public void addRewards(Rewards rewards) {
        AssertsUtil.isTrue(rewardsMapper.insertSelective(rewards)!=1,"添加失败!");
    }

    @Override
    public void updateRewards(Rewards rewards) {
        AssertsUtil.isTrue(rewardsMapper.updateByPrimaryKeySelective(rewards)!=1,"更新失败!");
    }

    @Override
    @Transactional
    public void deleteRewards(List<Integer> ids) {
        AssertsUtil.isTrue(rewardsMapper.deleteBatchIds(ids)!=1,"删除失败!");
    }
}
