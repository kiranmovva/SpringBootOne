package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.client.RestTemplate;

import com.student.service.StudentInfo;

@SpringBootApplication(scanBasePackages={"com.student.service"})
@EnableMongoRepositories(basePackages={"com.student.repogitery"})
public class MongoTransApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoTransApplication.class, args);
	}
	
	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder){
		return builder.build();
	}
	
	@Bean
	public CommandLineRunner run(RestTemplate template)throws RuntimeException{
		return args->{
		StudentInfo stdInfo=template.getForObject("http://gturnquist-quoters.cfapps.io/api/random", StudentInfo.class);
		 System.out.println("Std info::"+stdInfo);
		};
	}
}
