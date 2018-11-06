package com.anshul.designpatterns.structural.proxy.image;

/**
 * Generally Proxy would take some information
 * which help proxy to define what course of
 * action should be taken.
 */
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
