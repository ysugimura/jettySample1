package com.cm55.jettySample1.webapp;

import java.io.*;

import javax.servlet.http.*;

import com.cm55.jettySample1.container.*;

public class Servlet1 extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse r) throws IOException {
    CLCheck.check("Servlet1", getClass());
    HtmlOut.output(r, 
      "<html><body>shared value = " + ContainerSide.getSharedValue() + "</body></html>"
    );
  }
}
