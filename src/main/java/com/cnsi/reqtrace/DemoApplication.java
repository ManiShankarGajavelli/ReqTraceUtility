package com.cnsi.reqtrace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.cnsi.reqtrace.model.FileStoragePath;

@SpringBootApplication
@EnableConfigurationProperties({
	FileStoragePath.class
})
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
