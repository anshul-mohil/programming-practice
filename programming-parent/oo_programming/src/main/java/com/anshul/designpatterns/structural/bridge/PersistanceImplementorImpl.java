package com.anshul.designpatterns.structural.bridge;

public class PersistanceImplementorImpl implements Persistance {

  private PersistanceImplementor implementor = null;

  public PersistanceImplementorImpl(PersistanceImplementor imp) {
    this.implementor = imp;
  }

  @Override
  public void deleteById(String id) {
    implementor.deleteObject(Long.parseLong(id));
  }

  @Override
  public Object findById(String objectId) {

    return implementor.getObject(Long.parseLong(objectId));
  }


  @Override
  public String persist(Object object) {
    return Long.toString(implementor.saveObject(object));
  }

}
