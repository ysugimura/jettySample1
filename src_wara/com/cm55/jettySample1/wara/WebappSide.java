package com.cm55.jettySample1.wara;

public class WebappSide {

  private static String value;
  
  public static void setWebappMessage(String value) {
    WebappSide.value = value;
  }
  
  public static String getWebappMessage() {
    return value;
  }
}
