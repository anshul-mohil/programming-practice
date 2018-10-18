package com.anshul.designpatterns.structural.composite;

public class TriangleLeaf implements ShapeBaseComponent {
  @Override
  public void draw(String fillColor) {
    System.out.println(" creating triangle with color " + fillColor);
  }
}
