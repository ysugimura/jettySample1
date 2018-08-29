package com.cm55.jettySample1.webapp;

import java.io.*;

import javax.servlet.http.*;

import com.cm55.jettySample1.container.*;

public class Servlet2 extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse r) throws IOException {
    HtmlOut.output(r, 
        "<html><body>" + ContainerSide.getWebappMessage() + "</body></html>"
      );
  }
  
}
