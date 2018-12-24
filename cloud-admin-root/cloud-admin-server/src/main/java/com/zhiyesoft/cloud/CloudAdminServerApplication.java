package com.zhiyesoft.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class CloudAdminServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudAdminServerApplication.class, args);
	}

}

