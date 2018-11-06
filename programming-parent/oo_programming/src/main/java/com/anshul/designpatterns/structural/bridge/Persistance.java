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
  String persist(Object object);

  /**
   * @param objectId
   * @return persisted Object
   */
  Object findById(String objectId);

  /**
   * @param id
   */
  void deleteById(String id);


}
