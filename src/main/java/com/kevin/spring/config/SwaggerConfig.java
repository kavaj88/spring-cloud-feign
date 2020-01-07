package com.kevin.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Author：Bruce
 * @Date：Created in 10:35 2019/4/1
 * @Description：swagger配置
 * @Version: $
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    private ApiInfo creaeAi(){
        return new ApiInfoBuilder().title("标题：微服务体验").description("描述：初体验微服务").version("版本：1.0").build();
    }
    @Bean
    public Docket createD(){
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(creaeAi()).select().apis(RequestHandlerSelectors.basePackage("com.kevin.spring.web")).build();
    }
}
