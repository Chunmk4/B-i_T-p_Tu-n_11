package com.example.qlsp.services;

import com.example.qlsp.models.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImple implements ProductService {
    private static List<Product> products;

    public ProductServiceImple() {
        products = new ArrayList<>();
        products.add(new Product(1, "Iphone 10", "Dien thoai", 15000));
        products.add(new Product(2, "Iphone 11", "Dien thoai", 19000));
        products.add(new Product(3, "Iphone 12", "Dien thoai", 20000));
    }

    @Override
    public List<Product> getAll() {
        return products;
    }

    @Override
    public void add(Product product) {
        products.add(product);
    }

    @Override
    public Product findById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }

        return null;
    }

    @Override
    public boolean updateProduct(int id, Product newProduct) {
        Product product = findById(id);
        if (product == null) return false;

        product.setId(newProduct.getId());
        product.setName(newProduct.getName());
        product.setDescription(newProduct.getDescription());
        product.setPrice(newProduct.getPrice());
        return true;
    }

    @Override
    public boolean delete(int id) {
        Product product = findById(id);
        if (product == null) return false;

        products.remove(product);
        return true;
    }

    @Override
    public List<Product> findByName(String name){
        List<Product> productList = new ArrayList<>();
        for (Product product: products){
            if(product.getName().contains(name)){
                productList.add(product);
            }
        }
        return productList;
    }
}
