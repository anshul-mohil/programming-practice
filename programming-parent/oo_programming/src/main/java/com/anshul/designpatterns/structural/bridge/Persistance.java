package com.anshul.designpatterns.structural.bridge;

/**
 * Persistence Interface
 * Abstraction Interface
 */
interface Persistance {

  /**
   * @param object
   * @return returns objectID
   */
  public String persist(Object object);

  /**
   * @param objectId
   * @return persisted Object
   */
  public Object findById(String objectId);

  /**
   * @param id
   */
  public void deleteById(String id);


}
