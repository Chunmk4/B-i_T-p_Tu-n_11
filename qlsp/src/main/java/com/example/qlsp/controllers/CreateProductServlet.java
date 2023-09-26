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

@WebServlet(urlPatterns = "/product-create")
public class CreateProductServlet extends HttpServlet {
    private ProductService productService = new ProductServiceImple();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("product/create-product.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String description = req.getParameter("description");
        double price = Double.parseDouble(req.getParameter("price"));

        Product product = new Product(id, name, description, price);
        productService.add(product);
//        HttpSession session = req.getSession();
//        List<Product> products = (List<Product>) session.getAttribute("products");
//        products.add(product);

        resp.sendRedirect("/product");
//        req.setAttribute("products", products);
//        req.getRequestDispatcher("product.jsp").forward(req, resp);
    }
}
