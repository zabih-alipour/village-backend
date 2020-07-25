package com.alipour.product.villagesite.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.annotation.Order;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = {
        "com.alipour.product.villagesite.listeners",
        "com.alipour.product.villagesite.repositories",
        "com.alipour.product.villagesite.services",
})
@Order(1)
public class ApplicationConfig {
    @Value("${spring.datasource.username}")
    private String username;

    @Value("${spring.datasource.password}")
    private String password;

    @Bean(name = "datasource")
    @Primary
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource dataSource() {
        return DataSourceBuilder.create()
                .username(username)
                .password(password)
                .build();
    }


}
