package com.anshul.designpatterns.structural.composite;

import java.util.List;

public class ShapeComposite implements ShapeBaseComponent {

  private final List<ShapeBaseComponent> shapeBaseComponents;

  public ShapeComposite(List<ShapeBaseComponent> shapeBaseComponents) {
    this.shapeBaseComponents = shapeBaseComponents;
  }

  public void add(ShapeBaseComponent shapeBaseComponent) {
    shapeBaseComponents.add(shapeBaseComponent);
  }

  public void remove(ShapeBaseComponent shapeBaseComponent) {
    shapeBaseComponents.remove(shapeBaseComponent);
  }

  @Override
  public void draw(String fillColor) {
    for (ShapeBaseComponent leaf : shapeBaseComponents) {
      leaf.draw(fillColor);
    }
  }
}
