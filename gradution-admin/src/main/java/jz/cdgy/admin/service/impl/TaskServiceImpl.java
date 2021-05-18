package jz.cdgy.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import jz.cdgy.admin.service.TaskService;
import jz.cdgy.admin.util.AssertsUtil;
import jz.cdgy.mbg.mapper.StandardMapper;
import jz.cdgy.mbg.mapper.TaskMapper;
import jz.cdgy.mbg.pojo.Standard;
import jz.cdgy.mbg.pojo.Status;
import jz.cdgy.mbg.pojo.Task;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TaskServiceImpl implements TaskService {
    @Autowired
    private TaskMapper taskMapper;
    @Override
    public PageInfo<Task> getAllTask(Integer page, Integer limit, Task task) {
        PageHelper.startPage(page,limit);
        return new PageInfo<Task>(taskMapper.getAllTask(task));
    }

    @Override
    public void addTask(Task task) {
        AssertsUtil.isTrue(taskMapper.insertSelective(task)!=1,"添加失败!");
    }

    @Override
    public void updateTask(Task task) {
        AssertsUtil.isTrue(taskMapper.updateByPrimaryKeySelective(task)!=1,"更新失败!");
    }

    @Override
    @Transactional
    public void deleteTask(List<Integer> ids) {
        AssertsUtil.isTrue(taskMapper.deleteBatchIds(ids)!=1,"删除失败!");
    }

    @Override
    public List<Map<String, Object>> getTaskMap() {
        QueryWrapper<Task> queryWrapper = new QueryWrapper();
        queryWrapper.select("id as value","task_name as label");
        return taskMapper.selectMaps(queryWrapper);
    }
}
