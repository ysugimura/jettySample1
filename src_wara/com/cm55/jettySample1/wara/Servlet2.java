package com.cm55.jettySample1.wara;

import java.io.*;

import javax.servlet.http.*;

import com.cm55.jettySample1.container.*;

public class Servlet2 extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse r) throws IOException {
    CLCheck.check("Servlet2", getClass());
    WebappSide.setWebappMessage("hello world");
    HtmlOut.output(r, 
        "<html><body>" + ContainerSide.getWebappMessage() + "</body></html>"
      );
  }
  
}
