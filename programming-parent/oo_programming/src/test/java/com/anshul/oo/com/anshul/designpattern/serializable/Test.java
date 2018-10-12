package com.anshul.oo.com.anshul.designpattern.serializable;

import java.io.*;

class Test {

  @org.junit.Test
  public static void main(String[] args) {
    Demo object = new Demo(1, "geeksforgeeks");

   // object.empl.setAge(10);
   // object.empl.setName("anshul");

    String filename = "file.ser";

    // Serialization
    try {
      //Saving of object in a file
      FileOutputStream file = new FileOutputStream(filename);
      ObjectOutputStream out = new ObjectOutputStream(file);

      // Method for serialization of object
      out.writeObject(object);

      out.close();
      file.close();

      System.out.println("Object has been serialized");

    } catch (IOException ex) {
      System.out.println("IOException is caught");
    }


    Demo object1 = null;

    // Deserialization
    try {
      // Reading the object from a file
      FileInputStream file = new FileInputStream(filename);
      ObjectInputStream in = new ObjectInputStream(file);

      // Method for deserialization of object
      object1 = (Demo) in.readObject();

      in.close();
      file.close();

      System.out.println("Object has been deserialized ");
      System.out.println("a = " + object1.a);
      System.out.println("b = " + object1.b);
    } catch (IOException ex) {
      System.out.println("IOException is caught");
    } catch (ClassNotFoundException ex) {
      System.out.println("ClassNotFoundException is caught");
    }

  }
}