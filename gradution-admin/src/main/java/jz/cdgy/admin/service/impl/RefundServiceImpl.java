package jz.cdgy.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.R;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import jz.cdgy.admin.service.RefundWayService;
import jz.cdgy.admin.util.AssertsUtil;
import jz.cdgy.mbg.mapper.RefundWayMapper;
import jz.cdgy.mbg.mapper.SpendWayMapper;
import jz.cdgy.mbg.pojo.RefundWay;
import jz.cdgy.mbg.pojo.SpendWay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
public class RefundServiceImpl implements RefundWayService {
    @Autowired
    private RefundWayMapper refundWayMapper;

    @Override
    public List<Map<String, Object>> getRefundWay() {
        QueryWrapper<RefundWay> queryWrapper = new QueryWrapper();
        queryWrapper.select("id as value","refund_name as label");
        queryWrapper.eq("is_valid",1);
        return refundWayMapper.selectMaps(queryWrapper);
    }

    @Override
    public PageInfo<RefundWay> getAllRefundWay(Integer page, Integer limit, RefundWay refundWay) {
        PageHelper.startPage(page,limit);
        return new PageInfo<RefundWay>(refundWayMapper.selectList(new QueryWrapper<RefundWay>()));
    }

    @Override
    public void addRefundWay(RefundWay refundWay) {
        AssertsUtil.isTrue(refundWayMapper.insertSelective(refundWay)!=1,"添加失败!");
    }

    @Override
    @Transactional
    public void deleteRefundWay(List<Integer> id) {
        AssertsUtil.isTrue(refundWayMapper.deleteBatchIds(id)!=1,"删除失败!");
    }

    @Override
    public void updateRefundWay(RefundWay refundWay) {
        AssertsUtil.isTrue(refundWayMapper.updateByPrimaryKeySelective(refundWay)!=1,"更新失败!");
    }
}
