package com.anshul.designpatterns.structural.composite;

public class CircleLeaf implements ShapeBaseComponent {
  @Override
  public void draw(String fillColor) {
    System.out.println("Creating circle with color " + fillColor);
  }
}
