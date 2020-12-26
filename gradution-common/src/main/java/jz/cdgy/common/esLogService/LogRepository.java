package jz.cdgy.common.esLogService;

import jz.cdgy.common.model.esLog;
import org.springframework.data.repository.CrudRepository;

public interface LogRepository extends CrudRepository<esLog,String> {

}
