package com.projeto.compasso.pedido.config;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket swagger() {
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.basePackage("com.projeto.compasso.pedido"))
                .paths(PathSelectors.regex("/.*")).build().apiInfo(metaInfo());
    }

    private ApiInfo metaInfo() {
        ApiInfo api = new ApiInfo("Projeto Compasso", "Segundo projeto proposto pela Compasso",
                "Criado por Nycolas Darosci", "Terms",
                new Contact("Nycolas", "https://github.com/NycolasDarosci", "nycoollaas@gmail.com"), null, null,
                new ArrayList<VendorExtension>());
        return api;

    }
}
