package com.anshul.designpatterns.structural.composite;

public class LineLeaf implements ShapeBaseComponent {
  @Override
  public void draw(String fillColor) {
    System.out.println("creating line with  color " + fillColor);
  }
}
