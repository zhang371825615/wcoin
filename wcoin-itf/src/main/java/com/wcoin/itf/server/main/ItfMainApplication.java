package com.wcoin.itf.server.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages="com.wcoin")
@EntityScan(basePackages = "com.wcoin")
public class ItfMainApplication  {
	  public static void main(String[] args) {  
	        SpringApplication.run(ItfMainApplication.class, args);  
	    }
}
