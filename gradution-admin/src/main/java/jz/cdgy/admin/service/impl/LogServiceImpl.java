package jz.cdgy.admin.service.impl;

import cn.hutool.db.PageResult;
import jz.cdgy.admin.service.LogService;
import jz.cdgy.admin.util.AssertsUtil;
import jz.cdgy.common.esLogService.LogRepository;
import jz.cdgy.common.model.esLog;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.elasticsearch.index.query.BoolQueryBuilder;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.sort.FieldSortBuilder;
import org.elasticsearch.search.sort.SortBuilders;
import org.elasticsearch.search.sort.SortOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
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
    public Page<esLog> searchAllLog(Integer page, Integer limit, esLog log) {
        System.out.println(2);
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
            boolQueryBuilder.must(QueryBuilders.rangeQuery("operatorTime").from(item[0]).to(item[1]).format("yyyy-MM-dd HH:mm:ss"));

        }
        PageRequest pageRequest = PageRequest.of(page,limit);
        NativeSearchQuery query = new NativeSearchQueryBuilder()
                                  .withQuery(boolQueryBuilder)
                                  .withPageable(pageRequest)
                                  .build();
        SearchHits<esLog> searchHits = elasticsearchRestTemplate.search(query,esLog.class);
        List<esLog>  esLogs =  searchHits.stream().map(s->s.getContent()).collect(Collectors.toList());
        return new PageImpl<esLog>(esLogs,pageRequest,searchHits.getTotalHits());
    }

    @Override
    public void addLog(esLog log) {
         logRepository.save(log);
    }
}
