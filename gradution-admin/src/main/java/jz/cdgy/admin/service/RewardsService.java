package jz.cdgy.admin.service;

import com.github.pagehelper.PageInfo;
import jz.cdgy.mbg.pojo.Position;
import jz.cdgy.mbg.pojo.Rewards;

import java.util.List;
import java.util.Map;

public interface RewardsService {
    PageInfo<Rewards> getAllRewards(Integer page, Integer limit, Rewards rewards);

    void addRewards(Rewards rewards);

    void updateRewards(Rewards rewards);

    void deleteRewards (List<Integer> id);
}
