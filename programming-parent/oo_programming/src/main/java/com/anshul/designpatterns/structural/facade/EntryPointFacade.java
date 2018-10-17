package com.anshul.designpatterns.structural.facade;

public class EntryPointFacade {
  public static void main(String[] args) {
    DBHelperFacade dbHelperFacade = new DBHelperFacade(null);
    dbHelperFacade.createReport(DBType.ORACLE, ReportType.HTML, "some table");
  }

}
