package com.example.spring_jdbc.dao;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

//@Configuration
//@ConfigurationProperties(prefix = "database")
public class RepDataBasesDAO {
    private Map<String, DataSourceProperties> dataSource = new HashMap<>();
//    private Map<String, DataBaseDAO> dataSource = new HashMap<>();
//    private Map<String, DataSource> dataSource;


    public Map<String, DataSourceProperties> getDataSource() {
        return dataSource;
    }

    public void setDataSource(Map<String, DataSourceProperties> dataSource) {
        this.dataSource = dataSource;
    }
}
