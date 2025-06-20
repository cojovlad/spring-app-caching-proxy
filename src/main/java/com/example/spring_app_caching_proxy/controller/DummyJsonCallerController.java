package com.example.spring_app_caching_proxy.controller;

import com.example.spring_app_caching_proxy.service.DummyJsonCallerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class DummyJsonCallerController {

    private final DummyJsonCallerServiceImpl dummyJsonCallerService;

    @Autowired
    public DummyJsonCallerController(DummyJsonCallerServiceImpl dummyJsonCallerService) {
        this.dummyJsonCallerService = dummyJsonCallerService;
    }

    @GetMapping("/products")
    @Cacheable("productCache")
    public String getProducts() {
        return dummyJsonCallerService.getProducts();
    }
}
