package com.cm55.jettySample1.container;


import java.io.*;

import org.eclipse.jetty.server.*;
import org.eclipse.jetty.util.resource.*;
import org.eclipse.jetty.webapp.*;

public class Main {

  public static void main(String[]args) throws Exception {
    
    ContainerSide.setSharedValue(123);
    
    Server server = new Server(8080);    
    WebAppContext war = new WebAppContext();
    war.setContextPath("/");
    war.setWarResource(new FileResource(new File("war")));
    server.setHandler(war);
    server.start();
  }
}
