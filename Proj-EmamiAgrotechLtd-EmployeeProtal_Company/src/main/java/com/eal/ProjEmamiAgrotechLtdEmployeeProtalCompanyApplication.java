package com.eal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ProjEmamiAgrotechLtdEmployeeProtalCompanyApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjEmamiAgrotechLtdEmployeeProtalCompanyApplication.class, args);
	}

}
