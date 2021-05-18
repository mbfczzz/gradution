package jz.cdgy.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import jz.cdgy.admin.service.PositionService;
import jz.cdgy.admin.util.AssertsUtil;
import jz.cdgy.mbg.mapper.PositionMapper;
import jz.cdgy.mbg.pojo.Position;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Service
public class PositionServiceImpl implements PositionService {

    @Autowired
    private PositionMapper positionMapper;
    @Override
    public PageInfo<Position> getAllPosition(Integer page, Integer limit, Position position) {
        QueryWrapper<Position> queryWrapper = new QueryWrapper();
        if(StringUtils.isNotBlank(position.getPositionName())){
            queryWrapper.in("id", Arrays.asList(position.getPositionName().split(",")));
        }
        if(position.getIsValid()!=null){
            queryWrapper.eq("is_valid",position.getIsValid());
        }
        if(StringUtils.isNotBlank(position.getCreateTimeStr())){
            queryWrapper.between("create_time",position.getCreateTimeStr().split(",")[0],position.getCreateTimeStr().split(",")[1]);
        }
        PageHelper.startPage(page,limit);
        return new PageInfo<Position>(positionMapper.selectList(queryWrapper));
    }

    @Override
    public void addPosition(Position position) {
        AssertsUtil.isTrue(positionMapper.insertSelective(position)!=1,"添加失败!");
    }

    @Override
    public void updatePosition(Position position) {
        AssertsUtil.isTrue(positionMapper.updateByPrimaryKeySelective(position)!=1,"更新失败!");
    }

    @Override
    @Transactional
    public void deletePosition(List<Integer> ids) {
        AssertsUtil.isTrue(positionMapper.deleteBatchIds(ids)!=1,"删除失败!");
    }

    @Override
    public List<Map<String, Object>> getPositionName() {
        QueryWrapper<Position> queryWrapper = new QueryWrapper();
        queryWrapper.select("id as value","position_name as label");
        return positionMapper.selectMaps(queryWrapper);
    }
}
