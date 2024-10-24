package com.xa.batch342.services;

import java.util.List;

import com.xa.batch342.dtos.requests.ProductRequestDto;
import com.xa.batch342.dtos.responses.ProductResponseDto;
import com.xa.batch342.entities.Product;

public interface ProductService {
    List<ProductResponseDto> getAllProducts();
    Product saveProduct(ProductRequestDto productRequestDto);
    ProductResponseDto getProductBySlug(String slug);
    void deleteProductBySlug(String slug);
}
