package jz.cdgy.admin.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket webapiconfig(){
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("gradution")
                .apiInfo(getApiinfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("jz.cdgy.admin.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    public ApiInfo getApiinfo(){
        return new ApiInfoBuilder()
                .title("this is gradution of swagger")
                .description("of description")
                .build();
    }

}
