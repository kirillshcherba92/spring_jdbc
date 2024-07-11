package com.example.spring_jdbc.dao;

import java.util.List;

public class DestinationTableDAO extends DataBaseDAO{
    private String tableName;
    private List<String> additionalRows;

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public List<String> getAdditionalRows() {
        return additionalRows;
    }

    public void setAdditionalRows(List<String> additionalRows) {
        this.additionalRows = additionalRows;
    }
}
