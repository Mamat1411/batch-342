package com.xa.batch342.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xa.batch342.dtos.requests.ProductRequestDto;
import com.xa.batch342.dtos.responses.ProductResponseDto;
import com.xa.batch342.entities.Product;
import com.xa.batch342.repositories.ProductRepository;
import com.xa.batch342.services.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    ProductRepository productRepository;

    ModelMapper modelMapper = new ModelMapper();

    @Override
    public List<ProductResponseDto> getAllProducts() {
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        List<Product> products = productRepository.getAllProducts();
        List<ProductResponseDto> productResponseDtos = products.stream().map(product -> modelMapper.map(product, ProductResponseDto.class)).collect(Collectors.toList());
        return productResponseDtos;
    }

    @Override
    public Product saveProduct(ProductRequestDto productRequestDto) {
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        modelMapper.getConfiguration().setSkipNullEnabled(true);
        Product product = modelMapper.map(productRequestDto, Product.class);
        return productRepository.save(product);
    }

    @Override
    public ProductResponseDto getProductBySlug(String slug) {
        Product product = productRepository.getProductBySlug(slug);
        ProductResponseDto productResponseDto = modelMapper.map(product, ProductResponseDto.class);
        return productResponseDto;
    }

    @Override
    public void deleteProductBySlug(String slug) {
        Product product = productRepository.getProductBySlug(slug);
        productRepository.deleteById(product.getId());
    }
}
