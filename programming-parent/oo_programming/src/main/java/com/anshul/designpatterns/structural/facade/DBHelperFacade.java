package com.anshul.designpatterns.structural.facade;

import java.sql.Connection;

public class DBHelperFacade {

  private final Connection connection;

  public DBHelperFacade(Connection connection) {
    this.connection = connection;
  }

  public void createReport(DBType dbType, ReportType reportType, String tableName) {
    Connection con = null;
    switch (dbType) {
      case MYSQL:
        MySqlHelper mySqlHelper = new MySqlHelper();
        con = mySqlHelper.getConnection();
        generateReport(reportType, tableName, con, mySqlHelper);
        break;
      case ORACLE:
        OracleHelper oracleHelper = new OracleHelper();
        con = oracleHelper.getConnection();
        generateReport(reportType, tableName, con, oracleHelper);
        break;
    }
  }

  private void generateReport(ReportType reportType, String tableName, Connection con, DBHelper dbHelper) {
    switch (reportType) {
      case HTML:
        dbHelper.createHTMLReport(tableName, con);
        break;
      case PDF:
        dbHelper.createPDFReport(tableName, con);
        break;
    }
  }
}
