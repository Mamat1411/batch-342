package com.xa.batch342.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xa.batch342.dtos.requests.ProductRequestDto;
import com.xa.batch342.dtos.responses.ProductResponseDto;
import com.xa.batch342.entities.Product;
import com.xa.batch342.services.ProductService;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@SuppressWarnings("unused")
@RestController
@RequestMapping("/api/product")
public class ProductRestController {

    @Autowired
    ProductService productService;
    
    @GetMapping("")
    public ResponseEntity<?> getAllProducts() {
        LinkedHashMap<String, Object> resultMap = new LinkedHashMap<>();
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        try {
            List<Product> products = productService.getAllProducts();
            List<ProductResponseDto> productResponseDtos = new ArrayList<>();
            for (Product product : products) {
                ProductResponseDto productResponseDto = new ProductResponseDto();
                productResponseDto.setName(product.getName());
                productResponseDto.setSlug(product.getSlug());
                productResponseDto.setDescription(product.getDescription());
                productResponseDto.setCreatedAt(product.getCreatedAt());
                productResponseDto.setUpdatedAt(product.getUpdatedAt());
                productResponseDto.setCategory(product.getCategory());
                productResponseDtos.add(productResponseDto);
            }
            // List<ProductResponseDto> productResponseDtos = products.stream().map(product -> modelMapper.map(product, ProductResponseDto.class)).collect(Collectors.toList());
            resultMap.put("status", 200);
            resultMap.put("message", "success");
            resultMap.put("data", productResponseDtos);
            return new ResponseEntity<>(resultMap, HttpStatus.OK);
        } catch (Exception e) {
            resultMap.put("status", 500);
            resultMap.put("message", "failed");
            resultMap.put("error", e);
            return new ResponseEntity<>(resultMap, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    @PostMapping("")
    public ResponseEntity<?> saveCategory(@RequestBody ProductRequestDto productRequestDto) {
        LinkedHashMap<String, Object> resultMap = new LinkedHashMap<>();
        ModelMapper modelMapper = new ModelMapper();
        try {
            // Product product = modelMapper.map(productRequestDto, Product.class);
            Product product = new Product();
            product.setName(productRequestDto.getName());
            product.setSlug(productRequestDto.getSlug());
            product.setDescription(productRequestDto.getDescription());
            product.setCategoryId(productRequestDto.getCategoryId());
            product.setIsDeleted(productRequestDto.getIsDeleted());
            productService.saveProduct(product);
            resultMap.put("status", 200);
            resultMap.put("message", "success");
            resultMap.put("data", product);
            return new ResponseEntity<>(resultMap, HttpStatus.OK);
        } catch (Exception e) {
            resultMap.put("status", 500);
            resultMap.put("message", "failed");
            resultMap.put("error", e);
            return new ResponseEntity<>(resultMap, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
}
