package com.anshul.designpatterns.structural.proxy;

public class ImageProxy implements ImageViewer {

  private final String filePath;

  public ImageProxy(String filePath) {
    this.filePath = filePath;
  }

  @Override
  public void showImage() {
    if (filePath != null) {
      // may be checking file is present or not before
      // directing request to actual object
      new HighQualityImageLoader(filePath).showImage();
    }
  }
}
