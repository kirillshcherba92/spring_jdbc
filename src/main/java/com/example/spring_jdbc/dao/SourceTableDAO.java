package com.example.spring_jdbc.dao;

public class SourceTableDAO extends DataBaseDAO{
    private String tableName;
    private String tableInit;
    private String tableDone;

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getTableDone() {
        return tableDone;
    }

    public void setTableDone(String tableDone) {
        this.tableDone = tableDone;
    }

    public String getTableInit() {
        return tableInit;
    }

    public void setTableInit(String tableInit) {
        this.tableInit = tableInit;
    }
}
