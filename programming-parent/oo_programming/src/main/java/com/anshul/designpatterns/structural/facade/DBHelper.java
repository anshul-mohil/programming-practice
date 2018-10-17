package com.anshul.designpatterns.structural.facade;

import java.sql.Connection;

public interface DBHelper {
  Connection getConnection();

  void createHTMLReport(String tableName, Connection connection);

  void createPDFReport(String tableName, Connection connection);
}
