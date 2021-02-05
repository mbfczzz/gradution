package jz.cdgy.msg;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication(scanBasePackages = {"jz.cdgy.common","jz.cdgy.msg"})
@MapperScan(basePackages = {"jz.cdgy.mbg.mapper","jz.cdgy.msg.mapper"})
public class GradutionMsgApplication {

    public static void main(String[] args) {
        SpringApplication.run(GradutionMsgApplication.class, args);
    }

}
