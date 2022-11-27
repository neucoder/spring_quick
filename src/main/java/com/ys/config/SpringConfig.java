package com.ys.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.ys.service", "com.ys.dao"})
public class SpringConfig {
}
