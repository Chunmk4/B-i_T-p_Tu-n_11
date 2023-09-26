package com.example.qlsp.services;

import com.example.qlsp.models.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAll();

    void add(Product product);

    Product findById(int id);

    List<Product> findByName(String name);

    boolean updateProduct(int id, Product newProduct);

    boolean delete(int id);
}
