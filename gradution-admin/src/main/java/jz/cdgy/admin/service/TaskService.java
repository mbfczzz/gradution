package jz.cdgy.admin.service;

import com.github.pagehelper.PageInfo;
import jz.cdgy.mbg.pojo.Standard;
import jz.cdgy.mbg.pojo.Task;

import java.util.List;
import java.util.Map;

public interface TaskService {
    PageInfo<Task> getAllTask(Integer page, Integer limit, Task task);

    void addTask(Task task);

    void updateTask(Task task);

    void deleteTask(List<Integer> id);

    List<Map<String,Object>> getTaskMap();
}
