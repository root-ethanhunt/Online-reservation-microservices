package com.codeusingjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.Bean;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class PaytmWithSpringApplication {
	
//	@Bean
//	@LoadBalanced
//	public RestTemplate getRestTemplate() {
////		return new RestTemplate();
//		HttpComponentsClientHttpRequestFactory clientHttpRequestFactory = new HttpComponentsClientHttpRequestFactory();
//		clientHttpRequestFactory.setConnectTimeout(3000);
//		return new RestTemplate(clientHttpRequestFactory);
//	}

	public static void main(String[] args) {
		SpringApplication.run(PaytmWithSpringApplication.class, args);
	}

}
