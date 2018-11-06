package com.anshul.designpatterns.structural.proxy.image;

/**
 * Since creating object is expensive, we can lazy load
 * this object when proxy create and call method on this.
 */
public class HighQualityImageLoader implements ImageViewer {
  private final String filePath;

  public HighQualityImageLoader(String filePath) {
    this.filePath = filePath;
  }

  @Override
  public void showImage() {
    System.out.println(" ---> arrow image loaded ");
  }
}
