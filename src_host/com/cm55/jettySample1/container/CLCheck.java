package com.cm55.jettySample1.container;

public class CLCheck {

  public static void check(String name, Class<?>clazz) {
    System.out.print(name + ":");
    ClassLoader cl = clazz.getClassLoader();
    while (cl != null) {
      System.out.print(cl + " ");
      cl = cl.getParent();
    }
    System.out.println();
  }
}
