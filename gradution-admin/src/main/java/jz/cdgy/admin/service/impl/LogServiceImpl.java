package jz.cdgy.admin.service.impl;

import jz.cdgy.admin.service.LogService;
import jz.cdgy.common.esLogService.LogRepository;
import jz.cdgy.common.model.PageInfo;
import jz.cdgy.common.model.esLog;
import org.apache.commons.lang.StringUtils;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.script.Script;
import org.elasticsearch.search.sort.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.data.elasticsearch.core.SearchHits;
import org.springframework.data.elasticsearch.core.query.NativeSearchQuery;
import org.springframework.data.elasticsearch.core.query.NativeSearchQueryBuilder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LogServiceImpl implements LogService {

    @Autowired
    private LogRepository logRepository;
    @Autowired
    private ElasticsearchRestTemplate elasticsearchRestTemplate;

    @Override
    public PageInfo<esLog> searchAllLog(Integer page, Integer limit, esLog log) {
        BoolQueryBuilder boolQueryBuilder = new BoolQueryBuilder();
        if(!StringUtils.isEmpty(log.getOperator())){
                boolQueryBuilder.must(QueryBuilders.matchQuery("operator",log.getOperator()));
        }
        if(!StringUtils.isEmpty(log.getOperatorModel())){
            boolQueryBuilder.must(QueryBuilders.matchQuery("operatorModel",log.getOperatorModel()));
        }
        if(!StringUtils.isEmpty(log.getOperatorTarget())){
            boolQueryBuilder.must(QueryBuilders.matchQuery("operatorTarget",log.getOperatorTarget()));
        }
        if(!StringUtils.isEmpty(log.getOperatorTime())) {
            String[] item = log.getOperatorTime().split(",");
            boolQueryBuilder.must(QueryBuilders.rangeQuery("operatorTime")
                    .from(item[0])
                    .to(item[1]).format("yyyy-MM-dd"));
        }
        PageRequest pageRequest = PageRequest.of(page-1,limit);
        NativeSearchQuery query = new NativeSearchQueryBuilder()
                                  .withQuery(boolQueryBuilder)
                                  .withPageable(pageRequest)
                                  .build();
        SearchHits<esLog> searchHits = elasticsearchRestTemplate.search(query,esLog.class);
        List<esLog>  esLogs =  searchHits.stream().map(s->s.getContent()).collect(Collectors.toList());
        return new PageInfo<esLog>(page,limit,searchHits.getTotalHits(),esLogs);
    }

    @Override
    public void addLog(esLog log) {
         logRepository.save(log);
    }
}
