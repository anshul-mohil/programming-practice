package com.anshul.designpatterns.structural.bridge;

interface PersistanceImplementor {

  public long saveObject(Object object);

  public void deleteObject(long objectId);

  public Object getObject(long objectId);
}
