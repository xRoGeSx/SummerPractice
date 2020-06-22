package com.example.file_service_SPRING;

import com.example.file_service_SPRING.property.FileStorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({
	FileStorageProperties.class
})
public class FileServiceSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(FileServiceSpringApplication.class, args);
	}

}
