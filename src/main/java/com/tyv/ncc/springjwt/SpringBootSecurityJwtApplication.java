package com.tyv.ncc.springjwt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@SpringBootApplication
@EnableSwagger2
public class SpringBootSecurityJwtApplication {

	public static void main(String[] args) {
		System.out.println("Starting ncc Portal backend app");
		SpringApplication.run(SpringBootSecurityJwtApplication.class, args);
	}

	@Bean
	public Docket swaggerConfigurations()
	
	{
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.tyv.ncc.springjwt.controllers"))
				.build()
				.apiInfo(apiInfo());

	}

	private ApiInfo apiInfo() {
		return new ApiInfo(
				"NCC Portal Backed",
				"Describes the APIs.",
				"latest",
				"Terms of service",
				new Contact("ravigour", "", "ravi.gour20@gmail.com"),
				"License of API", "API license URL", Collections.emptyList());
	}
}
