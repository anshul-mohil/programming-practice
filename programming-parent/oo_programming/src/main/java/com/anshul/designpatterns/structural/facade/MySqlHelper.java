package com.anshul.designpatterns.structural.facade;

import java.sql.Connection;

public class MySqlHelper implements DBHelper {

  public Connection getConnection() {
    return null;
  }

  public void createHTMLReport(String tableName, Connection connection) {

    System.out.println("HTML Report is created from MYSQL db ");
  }

  public void createPDFReport(String tableName, Connection connection) {
    System.out.println("PDF Report is created from MYSQL DB");
  }
}
