package com.customer.restTemplate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class CustomerRestTemplate {

	@Bean
	public RestTemplate rest() {
		return new RestTemplate();
	}
}
