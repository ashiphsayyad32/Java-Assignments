package com.cms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.cms")
@EnableJpaRepositories(basePackages = "com.cms.repository")
@EntityScan(basePackages = "com.cms.model")
public class SpringRestMvcCmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestMvcCmsApplication.class, args);
	}

}
