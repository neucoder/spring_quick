package com.ys.config;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.ys")
@Import({JdbcConfig.class,MybatisConfig.class})
@PropertySource("classpath:jdbc.properties")
@EnableAspectJAutoProxy
public class SpringConfig {
}
