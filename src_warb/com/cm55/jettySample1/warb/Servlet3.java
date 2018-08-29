package com.cm55.jettySample1.warb;

import java.io.*;

import javax.servlet.http.*;

import com.cm55.jettySample1.container.*;

public class Servlet3 extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse r) throws IOException {
    CLCheck.check("Servlet3", getClass());
    HtmlOut.output(r, 
        "<html><body>servlet3</body></html>"
      );
  }
  
}
