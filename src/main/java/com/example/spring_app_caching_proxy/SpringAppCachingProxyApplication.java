package com.example.spring_app_caching_proxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringAppCachingProxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAppCachingProxyApplication.class, args);
	}

}
