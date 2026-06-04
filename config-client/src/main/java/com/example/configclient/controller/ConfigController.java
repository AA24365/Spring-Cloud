package com.example.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/config")
public class ConfigController {

    @Value("${mylog.version}")
    private String version;

    @Value("${mylog.name:默认名称}")
    private String name;

    @GetMapping("/getVersion")
    public String getVersion() {
        return "当前配置版本: " + version + ", 名称: " + name;
    }
}