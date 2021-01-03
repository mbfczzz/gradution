package jz.cdgy.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"jz.cdgy.admin","jz.cdgy.common"})
@MapperScan(basePackages = {"jz.cdgy.admin.mapper","jz.cdgy.mbg.mapper,com.baomidou.mybatisplus.samples.quickstart.mapper"})
public class AdminApplication {
    public  static void main(String[] args){
            SpringApplication.run(AdminApplication.class,args);
    }
}
