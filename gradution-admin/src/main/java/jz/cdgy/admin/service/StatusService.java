package jz.cdgy.admin.service;

import java.util.List;
import java.util.Map;

public interface StatusService {
    List<Map<String,Object>> getStatus(String type) ;
}
