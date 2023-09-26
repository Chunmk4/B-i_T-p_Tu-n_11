package com.example.qlsp.controllers;

import com.example.qlsp.models.Product;
import com.example.qlsp.services.ProductService;
import com.example.qlsp.services.ProductServiceImple;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet", value = "/product")
public class ProductServlet extends HttpServlet {
    private ProductService productService = new ProductServiceImple();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        List<Product> products = new ArrayList<>();
//        HttpSession session = req.getSession();
//        session.setAttribute("products", products);
        String q = req.getParameter("q");

        List<Product> products = productService.getAll();
        if(q != null && !q.isEmpty()){
            products = productService.findByName(q);
        }

        req.setAttribute("products", products);
        req.getRequestDispatcher("product/product.jsp").forward(req, resp);
    }
}
