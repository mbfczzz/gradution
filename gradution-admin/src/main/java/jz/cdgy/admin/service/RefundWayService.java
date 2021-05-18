package jz.cdgy.admin.service;

import com.github.pagehelper.PageInfo;
import jz.cdgy.mbg.pojo.RefundWay;
import jz.cdgy.mbg.pojo.SpendWay;

import java.util.List;
import java.util.Map;

public interface RefundWayService {
    List<Map<String,Object>> getRefundWay() ;

    PageInfo<RefundWay> getAllRefundWay(Integer page, Integer limit, RefundWay refundWay);

    void addRefundWay(RefundWay refundWay);

    void updateRefundWay(RefundWay refundWay);

    void deleteRefundWay(List<Integer> id);
}
