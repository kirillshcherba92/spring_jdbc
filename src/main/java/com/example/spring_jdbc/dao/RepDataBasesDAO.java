package com.example.spring_jdbc.dao;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;

import java.util.HashMap;
import java.util.Map;

public class RepDataBasesDAO {
    private Map<String, DataSourceProperties> dataSource = new HashMap<>();

    public Map<String, DataSourceProperties> getDataSource() {
        return dataSource;
    }

    public void setDataSource(Map<String, DataSourceProperties> dataSource) {
        this.dataSource = dataSource;
    }
}
