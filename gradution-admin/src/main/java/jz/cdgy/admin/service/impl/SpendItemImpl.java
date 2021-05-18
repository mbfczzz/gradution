package jz.cdgy.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import jz.cdgy.admin.service.SpendItemService;
import jz.cdgy.mbg.mapper.ItemMapper;
import jz.cdgy.mbg.pojo.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class SpendItemImpl implements SpendItemService {

    @Autowired
    private ItemMapper itemMapper;
    @Override
    public List<Map<String, Object>> getSpendItem() {
        QueryWrapper<Item> queryWrapper = new QueryWrapper();
        queryWrapper.select("id as value","item_name as label");
        return itemMapper.selectMaps(queryWrapper);
    }
}
