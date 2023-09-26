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

@WebServlet(value = "/product-edit")
public class EditProductServlet extends HttpServlet {
    private ProductService productService = new ProductServiceImple();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        Product product = productService.findById(id);

        req.setAttribute("product", product);
        req.getRequestDispatcher("edit-product.jsp").forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String description = req.getParameter("description");
        double price = Double.parseDouble(req.getParameter("price"));

        Product product = new Product(id, name, description, price);
        productService.updateProduct(id, product);
        resp.sendRedirect("/product");
    }
}
