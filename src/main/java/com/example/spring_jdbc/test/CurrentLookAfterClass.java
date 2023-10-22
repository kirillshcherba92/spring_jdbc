package com.example.spring_jdbc.test;

import com.example.spring_jdbc.config.ConfigConnectionDataBase;
import com.example.spring_jdbc.dao.DataSourceDAO;
import com.example.spring_jdbc.dao.RepDataBasesDAO;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
public class CurrentLookAfterClass {
    private final RepDataBasesDAO dataSourceDAO;

    public CurrentLookAfterClass(RepDataBasesDAO repDataBasesDAO) {
        this.dataSourceDAO = repDataBasesDAO;
    }

    public RepDataBasesDAO getDataSourceDAO() {
        return dataSourceDAO;
    }
}
