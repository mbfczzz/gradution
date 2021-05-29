package jz.cdgy.admin.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import jz.cdgy.admin.util.AssertsUtil;
import jz.cdgy.mbg.pojo.Problem;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ProblemService {
   PageInfo<Problem> getAllProblem(Integer page, Integer limit, Problem problem);

   void addProblem(Problem problem);

   void updateProblem(Problem problem);

   void deleteProblem(List<Integer> ids);
}
