package com.example.spring_jdbc.dao;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

//@Configuration
//@ConfigurationProperties(prefix = "database.datasource")
public class DataSourceDAO {
    private DataBaseDAO dataBaseDAO;

    public DataBaseDAO getDataBaseDAO() {
        return dataBaseDAO;
    }

    public void setDataBaseDAO(DataBaseDAO dataBaseDAO) {
        this.dataBaseDAO = dataBaseDAO;
    }
}
