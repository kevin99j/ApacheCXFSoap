package com.venko.apacheCxf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.venko.apacheCxf.config","com.venko.apacheCxf.service"})
public class ApacheCxfApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApacheCxfApplication.class, args);
		
	}

}
