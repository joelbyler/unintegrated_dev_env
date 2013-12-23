package org.codemash;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.nio.charset.Charset;

public class RomanNumeralServlet extends HttpServlet {

  private static final long serialVersionUID = 1L;

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)  
          throws ServletException, IOException {        
    resp.getOutputStream().write("Hello World!!!!".getBytes(Charset.forName("UTF-8")));
  }
}