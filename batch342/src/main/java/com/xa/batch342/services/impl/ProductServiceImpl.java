package com.xa.batch342.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xa.batch342.entities.Product;
import com.xa.batch342.repositories.ProductRepository;
import com.xa.batch342.services.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {
        return productRepository.getAllProducts();
    }

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }
    
    @Override
    public Product getProductById(Long id){
        return productRepository.findById(id).orElse(null);
    }
}
