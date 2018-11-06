package com.anshul.designpatterns.structural.bridge;

interface PersistanceImplementor {

  long saveObject(Object object);

  void deleteObject(long objectId);

  Object getObject(long objectId);
}
