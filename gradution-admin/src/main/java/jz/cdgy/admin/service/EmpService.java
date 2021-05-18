package jz.cdgy.admin.service;

import com.github.pagehelper.PageInfo;
import jz.cdgy.mbg.pojo.Emp;

import java.util.List;
import java.util.Map;

public interface EmpService {
    PageInfo<Emp> getAllEmp(Integer page, Integer limit, Emp emp);

    void addEmp(Emp emp);

    void updateEmp(Emp emp);

    void deleteEmp(List<Integer> id);

    List<Map<String,Object>> getEmpByName(String name);

    Emp getOneEmpByName(String name);

    Emp getOneEmpById(String id);
}
