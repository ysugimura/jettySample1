package com.cm55.jettySample1.wara;

import java.io.*;

import javax.servlet.http.*;

public class HtmlOut {

  static void output(HttpServletResponse r, String html) throws IOException {
    OutputStream out = r.getOutputStream();
    out.write(html.getBytes("UTF-8"));
    out.close();
    r.setStatus(HttpServletResponse.SC_OK);
  }
}
