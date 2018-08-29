package com.cm55.jettySample1;

import com.cm55.jettySample1.server.*;

public class HostSide {

  private static int value;
  
  public static void setSharedValue(int value) {
    HostSide.value = value;
  }
  
  public static int getSharedValue() {
    return value;
  }
  
  public static String getServerMessage() {
    return ServerSide.getServerMessage();
  }
}
