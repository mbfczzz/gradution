package jz.cdgy.admin.service;

import com.github.pagehelper.PageInfo;
import jz.cdgy.mbg.pojo.Department;
import jz.cdgy.mbg.pojo.Position;

import java.util.List;
import java.util.Map;

public interface DepartmentService {
    PageInfo<Department> getAllDepartment(Integer page, Integer limit, Department department);

    void addDepartment(Department department);

    void updateDepartment(Department department);

    void deleteDepartment (List<Integer> id);

    List<Map<String, Object>> getDepartmentName();
}
