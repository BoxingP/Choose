package com.boxing.hotel.servlet;

import com.boxing.hotel.hotelSystem.HotelChooser;
import com.boxing.hotel.unit.Hotel;
import com.boxing.hotel.unit.HotelList;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ResultServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String customerType = req.getParameter("customer_type");
        String startDate = req.getParameter("start_date");
        String endDate = req.getParameter("end_date");

        String hotelName = null;
        try {
            hotelName = calculateRecommendHotel(customerType, startDate, endDate);
        } catch (ParseException e) {
            throw new ServletException(e);
        }

        ServletOutputStream outputStream = resp.getOutputStream();
        resp.setContentType("text/html");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
        outputStreamWriter.write("<div>The recommend hotel is " + hotelName + ".</div>");
        outputStreamWriter.write("<a href=\"index\">Back</a>");
        outputStreamWriter.flush();
    }

    private String calculateRecommendHotel(String customerType, String startDateStr, String endDateStr) throws ParseException {
        SimpleDateFormat inputDateFormat = new SimpleDateFormat("yyyyMMdd");
        Date startDate = inputDateFormat.parse(startDateStr);
        Date endDate = inputDateFormat.parse(endDateStr);
        SimpleDateFormat outputDateFormat = new SimpleDateFormat("ddMMMyyyy()");
        String formattedStartDate = outputDateFormat.format(startDate);
        String formattedEndDate = outputDateFormat.format(endDate);


        String sequence = customerType + ": " + formattedStartDate + ", " + formattedEndDate;
        HotelChooser hotelChooser = new HotelChooser();
        Hotel recommendHotel = hotelChooser.choose(HotelList.HotelListing, sequence);
        return recommendHotel.getHotelName();
    }
}
