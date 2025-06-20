package com.example.spring_app_caching_proxy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class DummyJsonCallerServiceImpl {

    private final RestTemplate restTemplate;


    @Autowired
    public DummyJsonCallerServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String getProducts(){
        System.out.println("Calling external API...");
        return restTemplate.getForObject("http://dummyjson.com" + "/products", String.class);
    }
}
