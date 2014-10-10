package com.boxing.hotel.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class InputServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletOutputStream outputStream = resp.getOutputStream();
        resp.setContentType("text/html");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
        outputStreamWriter.write("<form action=\"result\">");
        outputStreamWriter.write("<p>Type:<input name=\"customer_type\"/></p>");
        outputStreamWriter.write("<p>Start Date:<input name=\"start_date\"/>eg.20140101</p>");
        outputStreamWriter.write("<p>End Date:<input name=\"end_date\"/>eg.20140103</p>");
        outputStreamWriter.write("<p><input type=\"submit\"/></p>");
        outputStreamWriter.write("</form>");
        outputStreamWriter.flush();
    }
}
