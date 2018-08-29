package com.cm55.jettySample1.server;

import java.io.*;

import javax.servlet.http.*;

import com.cm55.jettySample1.*;

public class Servlet1 extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse r) throws IOException {
    HtmlOut.output(r, 
      "<html><body>shared value = " + HostSide.getSharedValue() + "</body></html>"
    );
  }
}
