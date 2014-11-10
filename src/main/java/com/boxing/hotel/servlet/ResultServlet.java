package com.boxing.hotel.servlet;

import com.boxing.hotel.unit.*;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ResultServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String customerType = req.getParameter("customer_type");
        String startDate = req.getParameter("start_date");
        String endDate = req.getParameter("end_date");

        String hotelName;
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

    private String calculateRecommendHotel(String customerTypeStr, String startDateStr, String endDateStr) throws ParseException {
        CustomerType customerType=CustomerType.valueOf(customerTypeStr);
        SimpleDateFormat inputDateFormat = new SimpleDateFormat("ddMMMyyyy");
        Date startDate = inputDateFormat.parse(startDateStr);
        Date endDate = inputDateFormat.parse(endDateStr);

        Calendar day1 = new GregorianCalendar();
        Calendar day2 = new GregorianCalendar();

        day1.setTime(startDate);
        day2.setTime(endDate);
        List<Calendar> bookingDates = new ArrayList<Calendar>();

        while ( day1.compareTo(day2) <= 0) {
            bookingDates.add(day1);
            day1.add(Calendar.DAY_OF_YEAR,1);
        }

        BookInformation bookInformation = new BookInformation(customerType, bookingDates);

        HotelChooser hotelChooser = new HotelChooser();
        Hotel recommendHotel = hotelChooser.choose(HotelList.HotelListing, bookInformation);
        return recommendHotel.getHotelName();
    }
}
