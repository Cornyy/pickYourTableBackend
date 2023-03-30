package com.pickYourTable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class PickYourTableApplication {

	public static void main(String[] args) {
		SpringApplication.run(PickYourTableApplication.class, args);
	}

}
