package com.anshul.designpatterns.structural.proxy.image;

public class EntryPointProxy {
  public static void main(String[] args) {
    ImageProxy imageProxy = new ImageProxy("some file");
    imageProxy.showImage();
  }
}
