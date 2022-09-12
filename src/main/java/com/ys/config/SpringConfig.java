package com.ys.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;

@Configuration
@ComponentScan("com.ys")
@Import({JdbcConfig.class,MybatisConfig.class})
@PropertySource("jdbc.properties")
public class SpringConfig {
}
