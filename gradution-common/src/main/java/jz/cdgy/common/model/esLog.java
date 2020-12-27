package jz.cdgy.common.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.DateFormat;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;


@Data
@ToString
@Document(indexName = "log",shards = 1,replicas = 1,refreshInterval = "1s",indexStoreType = "fs",createIndex = false)
@AllArgsConstructor
@NoArgsConstructor
public class esLog {
    @Id
    @Field(type = FieldType.Keyword)
    private String id;
    //操作人
    @Field(type = FieldType.Text,analyzer = "ik_max_word")
    private String  operator;
    //操作时间
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern ="yyyy-MM-dd hh:mm:ss",timezone ="GMT+8")
    @Field(type = FieldType.Date, format = DateFormat.custom,pattern = "yyyy-MM-dd HH:mm:ss")
    private String  operatorTime;
    //操作模块
    @Field(type = FieldType.Text,analyzer = "ik_max_word")
    private String  operatorModel;
    //操作目的
    @Field(type = FieldType.Text,analyzer = "ik_max_word")
    private String  operatorTarget;
    //请求ip
    @Field(type = FieldType.Ip)
    private String  operatorIp;
    //请求方法
    @Field(type = FieldType.Keyword)
    private String  operatorMethod;
    //请求路径
    @Field(type = FieldType.Keyword)
    private String  requestUrl;
    //请求uri
    @Field(type = FieldType.Keyword)
    private String  requestUri;
    //返回结果
    @JsonIgnore
    @Field(type = FieldType.Object)
    private Object result;
    //请求参数
    @JsonIgnore
    @Field(type = FieldType.Object)
    private Object parameter;
}
