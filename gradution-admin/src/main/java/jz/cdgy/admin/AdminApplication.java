package jz.cdgy.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = {"jz.cdgy.mbg.mapper","jz.cdgy.admin.mapper"})
public class AdminApplication {
    public  static void main(String[] args){
            SpringApplication.run(AdminApplication.class,args);
    }
}
