package com.example.spring_jdbc.config;

import com.example.spring_jdbc.dao.RepDataBasesDAO;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.sql.DriverManager;

@Configuration
public class ConfigConnectionDataBase {

    @Bean
    @ConfigurationProperties(prefix = "database")
    public RepDataBasesDAO repDataBasesDAO() {
        return new RepDataBasesDAO();
    }

    @Bean
    public DataSource dataSource(RepDataBasesDAO repDataBasesDAO) {
        DriverManagerDataSource driverManager = new DriverManagerDataSource();
        return driverManager;
    }
}
