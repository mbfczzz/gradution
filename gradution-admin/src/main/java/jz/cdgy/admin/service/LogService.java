package jz.cdgy.admin.service;

import jz.cdgy.common.model.esLog;
import org.springframework.data.domain.Page;


public interface LogService {
        Page<esLog> searchAllLog(Integer page,Integer limit,esLog log);
        void         addLog(esLog log);
}
