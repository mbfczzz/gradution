package jz.cdgy.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = {"jz.cdgy.admin","jz.cdgy.common"})
@MapperScan(basePackages = {"jz.cdgy.admin.mapper","jz.cdgy.mbg.mapper"})
@EnableFeignClients
@EnableDiscoveryClient
public class AdminApplication {
    public  static void main(String[] args){
            SpringApplication.run(AdminApplication.class,args);
    }
}
