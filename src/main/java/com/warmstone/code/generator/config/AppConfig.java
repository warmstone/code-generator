package com.warmstone.code.generator.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;


@Configuration
public class AppConfig {

    @Resource
    private DataSourceConfiguration dataSourceConfiguration;

}
