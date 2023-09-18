package com.example.product_discount_calculator;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/display-discount")
public class DiscountServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Lấy dữ liệu từ form
        String productDescription = request.getParameter("productDescription");
        int listPrice = Integer.parseInt(request.getParameter("listPrice"));
        int discountPercent = Integer.parseInt(request.getParameter("discountPercent"));

        // Tính toán chiết khấu
        float discountAmount = (float) (listPrice * discountPercent * 0.01);
        float discountPrice = listPrice - discountAmount;

        // Hiển thị kết quả
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<h1 style=\"font-family: Arial\"> Máy tính giảm giá sản phẩm</h1>");
        out.println("</head>");
        out.println("<body>");
        out.println("<p>Mô tả Sản phẩm: " + productDescription + "</p>");
        out.println("<p>Bảng giá: " + listPrice + "</p>");
        out.println("<p>Phần trăm chiết khấu: " + discountPercent + "%</p>");
        out.println("<p>Số tiền chiết khấu: " + discountAmount + "</p>");
        out.println("<p>Giảm giá còn: " + discountPrice + "</p>");
        out.println("</body>");
        out.println("</html>");
    }
}