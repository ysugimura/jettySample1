package com.cm55.jettySample1.container;

import com.cm55.jettySample1.wara.*;

public class ContainerSide {

  private static int value;
  
  public static void setSharedValue(int value) {
    ContainerSide.value = value;
  }
  
  public static int getSharedValue() {
    return value;
  }
  
  public static String getWebappMessage() {
    return WebappSide.getWebappMessage();
  }
}
