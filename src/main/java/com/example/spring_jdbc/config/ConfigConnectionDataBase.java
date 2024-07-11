package com.example.spring_jdbc.config;

import com.example.spring_jdbc.dao.RepDataBasesDAO;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class ConfigConnectionDataBase {
// lol
    @Autowired
    private ApplicationContext applicationContext;

    @Bean
    @ConfigurationProperties(prefix = "database")
    public RepDataBasesDAO repDataBasesDAO() {
        return new RepDataBasesDAO();
    }

    @Bean
    public List<DataSource> dataSourceList (RepDataBasesDAO repDataBasesDAO) {
        List<DataSource> dataSources =  new ArrayList<>();
        ConfigurableListableBeanFactory beanFactory = ((ConfigurableApplicationContext) applicationContext).getBeanFactory();

        repDataBasesDAO.getDataSource().forEach((s, dataSourceProperties) -> {
            DataSource dataSource = dataSourceProperties.initializeDataSourceBuilder().build();
            beanFactory.registerSingleton(s, dataSource);
            dataSources.add(dataSource);
        });
        beanFactory.registerSingleton("dataSource", dataSources.get(0));
        return dataSources;
    }


}
