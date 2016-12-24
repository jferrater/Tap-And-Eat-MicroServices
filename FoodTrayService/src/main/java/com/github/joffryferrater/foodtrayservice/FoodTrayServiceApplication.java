package com.github.joffryferrater.foodtrayservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.ComponentScan;

import com.github.joffryferrater.foodtrayservice.repository.ItemServiceRepository;
import com.github.joffryferrater.foodtrayservice.repository.PriceServiceRepository;

@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker
@EnableHystrixDashboard
@EnableHystrix
//@EnableFeignClients
@EnableFeignClients(basePackageClasses = {ItemServiceRepository.class, PriceServiceRepository.class})
@ComponentScan(basePackageClasses = {ItemServiceRepository.class,PriceServiceRepository.class})
public class FoodTrayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodTrayServiceApplication.class, args);
	}
}
