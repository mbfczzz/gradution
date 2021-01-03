package jz.cdgy.admin.service;

import jz.cdgy.common.model.PageInfo;
import jz.cdgy.common.model.esLog;


public interface LogService {
        PageInfo<esLog> searchAllLog(Integer page, Integer limit, esLog log);
        void         addLog(esLog log);
}
