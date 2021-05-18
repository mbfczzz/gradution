package jz.cdgy.admin.service;

import com.github.pagehelper.PageInfo;
import jz.cdgy.mbg.pojo.Account;
import jz.cdgy.mbg.pojo.Assigment;

import java.util.List;
import java.util.Map;

public interface AssigmentService {
    PageInfo<Assigment> getAllAssigment(Integer page, Integer limit, Assigment assigment);

    void addAssigment(Assigment assigment);

    void updateAssigment(Assigment assigment);

    void deleteAssigment(List<Integer> ids);
}
