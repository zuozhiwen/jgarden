package com.fvotlan.garden;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class GardenApplication {

	public static void main(String[] args) {
		SpringApplication.run(GardenApplication.class, args);
	}

}
