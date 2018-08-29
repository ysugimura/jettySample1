package com.cm55.jettySample1;


import java.io.*;

import org.eclipse.jetty.server.*;
import org.eclipse.jetty.server.handler.*;
import org.eclipse.jetty.util.resource.*;
import org.eclipse.jetty.webapp.*;

public class Main {

  public static void main(String[]args) throws Exception {
    Server server = new Server(8080);    
    WebAppContext war = new WebAppContext();
    war.setContextPath("/");
    war.setWarResource(new FileResource(new File("war")));
    server.setHandler(war);
    server.start();
  }
}
