package com.anshul.designpatterns.structural.composite;

import java.util.LinkedList;
import java.util.List;

public class EntryPointComposite {
  public static void main(String[] args) {
    List<ShapeBaseComponent> leafList = new LinkedList<>();
    leafList.add(new LineLeaf());
    leafList.add(new CircleLeaf());
    leafList.add(new TriangleLeaf());
    ShapeBaseComponent shapeBaseComponent = new ShapeComposite(leafList);
    shapeBaseComponent.draw("Red");
  }
}
