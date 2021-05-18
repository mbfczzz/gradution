package jz.cdgy.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import jz.cdgy.admin.service.StatusService;
import jz.cdgy.mbg.mapper.StatusMapper;
import jz.cdgy.mbg.pojo.Status;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class StatusServiceImpl implements StatusService {
    @Autowired
    private StatusMapper statusMapper;

    @Override
    public List<Map<String, Object>> getStatus(String type) {
        QueryWrapper<Status> queryWrapper = new QueryWrapper();
        queryWrapper.select("id as value","status_name as label");
        if(StringUtils.isNotBlank(type)){
            queryWrapper.eq("type",type);
        }
        return statusMapper.selectMaps(queryWrapper);
    }
}
