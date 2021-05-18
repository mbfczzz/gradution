package jz.cdgy.admin.service;

import com.github.pagehelper.PageInfo;
import jz.cdgy.mbg.pojo.Recruit;

import java.util.List;

public interface RecruitService {

    PageInfo<Recruit> getAllRecruit(Integer page, Integer limit, Recruit recruit);

    void addRecruit(Recruit recruit);


    void updateRecruit(Recruit recruit) ;

    void deleteRecruit(List<Integer> ids);
}
