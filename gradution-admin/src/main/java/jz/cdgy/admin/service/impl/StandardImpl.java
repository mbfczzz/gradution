package jz.cdgy.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import jz.cdgy.admin.service.StandardService;
import jz.cdgy.admin.util.AssertsUtil;
import jz.cdgy.mbg.mapper.RoleMapper;
import jz.cdgy.mbg.mapper.StandardMapper;
import jz.cdgy.mbg.pojo.Standard;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StandardImpl extends ServiceImpl<StandardMapper,Standard> implements StandardService {
    @Autowired
    private StandardMapper standardMapper;
    @Override
    public PageInfo<Standard> getAllStandard(Integer page, Integer limit, Standard standard) {
        QueryWrapper<Standard> queryWrapper = new QueryWrapper();
        if(StringUtils.isNotBlank(standard.getStandardName())){
            queryWrapper.like("standard_name", standard.getStandardName());
        }
        if(StringUtils.isNotBlank(standard.getStandardType())){
            queryWrapper.in("standard_type", Arrays.asList(standard.getStandardType().split(",")));
        }
        if(StringUtils.isNotBlank(standard.getRewardDescribe())){
            queryWrapper.in("reward_describe", Arrays.asList(standard.getRewardDescribe().split(",")));
        }
        if(StringUtils.isNotBlank(standard.getCreateTimeStr())){
            queryWrapper.between("create_time",standard.getCreateTimeStr().split(",")[0],standard.getCreateTimeStr().split(",")[1]);
        }
        if(StringUtils.isNotBlank(standard.getUpdateTimeStr())){
            queryWrapper.in("update_time", standard.getUpdateTimeStr().split(",")[0],standard.getUpdateTimeStr().split(",")[1]);
        }
        if(standard.getIsValid()!=null){
            queryWrapper.eq("is_valid",standard.getIsValid());
        }
        if(StringUtils.isNotBlank(standard.getRewardContent())){
            queryWrapper.like("reward_content",standard.getRewardContent());
        }
        PageHelper.startPage(page,limit);
        return new PageInfo<Standard>(standardMapper.selectList(queryWrapper));
    }

    @Override
    public void addStandard(Standard standard) {
        AssertsUtil.isTrue(standardMapper.insertSelective(standard)!=1,"添加失败!");
    }

    @Override
    public void updateStandard(Standard standard) {
        AssertsUtil.isTrue(standardMapper.updateByPrimaryKeySelective(standard)!=1,"更新失败!");
    }

    @Override
    @Transactional
    public void deleteStandard(List<Integer> ids) {
        AssertsUtil.isTrue(standardMapper.deleteBatchIds(ids)!=1,"删除失败!");
    }

    @Override
    public List<Map<String, Object>> getStandardType() {
        QueryWrapper<Standard> queryWrapper = new QueryWrapper();
        queryWrapper.select("standard_name as value","standard_name as label");
        return standardMapper.selectMaps(queryWrapper);
    }

    @Override
    public List<Map<String, Object>> getStandardDescribe() {
        QueryWrapper<Standard> queryWrapper = new QueryWrapper();
        queryWrapper.select("reward_describe as value","reward_describe as label");
        return standardMapper.selectMaps(queryWrapper);
    }

    @Override
    public List<Map<String, Object>> getStandardName() {
        QueryWrapper<Standard> queryWrapper = new QueryWrapper();
        List<Map<String, Object>> standardName =  standardMapper.selectMaps(queryWrapper.select("id as value","standard_name as label"));
        Map<String, Object> map = new HashMap(2);
        map.put("label","自定义模板");
        map.put("value",0);
        standardName.add(map);
        return standardName;
    }

    @Override
    public Standard getStandardByStandardName(String name) {
        QueryWrapper<Standard> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("standard_name",name);
        return standardMapper.selectOne(queryWrapper);
    }

    @Override
    public Standard getStandardByStandardId(String id) {
        QueryWrapper<Standard> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id",id);
        return standardMapper.selectOne(queryWrapper);
    }
}
