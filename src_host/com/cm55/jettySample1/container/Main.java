package com.cm55.jettySample1.container;


import java.io.*;

import org.eclipse.jetty.server.*;
import org.eclipse.jetty.server.handler.*;
import org.eclipse.jetty.util.resource.*;
import org.eclipse.jetty.webapp.*;

public class Main {

  public static void main(String[]args) throws Exception {
    CLCheck.check("Main", Main.class);
    
    ContainerSide.setSharedValue(123);
    
    Server server = new Server(8080);    
    WebAppContext wara = new WebAppContext();
    wara.setContextPath("/a");
    wara.setWar("wara");
    
    WebAppContext warb = new WebAppContext();
    warb.setContextPath("/b");
    warb.setWar("warb");
    
    server.setHandler(new ContextHandlerCollection(
      wara, 
      warb
    ));
    server.start();
  }
}
