package com.example.spring_jdbc.dao;

public class DataSourceDAO {
    private DataBaseDAO dataBaseDAO;

    public DataBaseDAO getDataBaseDAO() {
        return dataBaseDAO;
    }

    public void setDataBaseDAO(DataBaseDAO dataBaseDAO) {
        this.dataBaseDAO = dataBaseDAO;
    }
}
