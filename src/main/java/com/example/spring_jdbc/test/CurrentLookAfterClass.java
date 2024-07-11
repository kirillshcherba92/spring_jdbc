package com.example.spring_jdbc.test;

import com.example.spring_jdbc.dao.RepDataBasesDAO;
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
