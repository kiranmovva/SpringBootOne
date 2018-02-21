package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mongodb.MongoClientOptions;

@Configuration
  public class DatabaseConnectionConfig {
	
	@Bean
	public MongoClientOptions mongoOptions(){
		return MongoClientOptions.builder()
                .connectTimeout(1000)
                .maxConnectionIdleTime(1500)
                .threadsAllowedToBlockForConnectionMultiplier(4)
                .socketTimeout(1500)
                .build();
	}

}
