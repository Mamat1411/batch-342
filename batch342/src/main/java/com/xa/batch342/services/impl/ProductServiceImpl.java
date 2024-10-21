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

    @Override
    public void deleteProductById(Long id) {
        Product product = productRepository.findById(id).orElse(null);
        productRepository.deleteById(product.getId());
    }

    @Override
    public Product getProductBySlug(String slug) {
        return productRepository.getProductBySlug(slug);
    }

    @Override
    public void deleteProductBySlug(String slug) {
        Product product = productRepository.getProductBySlug(slug);
        productRepository.deleteById(product.getId());
    }
}
