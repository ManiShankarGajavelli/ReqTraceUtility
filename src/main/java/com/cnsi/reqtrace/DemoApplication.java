package com.cnsi.reqtrace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.cnsi.reqtrace.model.domain.FileStoragePath;

@SpringBootApplication
@EnableConfigurationProperties({
	FileStoragePath.class
})
@EnableAutoConfiguration
@EnableJpaRepositories
@EntityScan
@ComponentScan("com.cnsi.reqtrace")
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
