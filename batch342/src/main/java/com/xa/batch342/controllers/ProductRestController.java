package com.xa.batch342.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xa.batch342.dtos.requests.ProductRequestDto;
import com.xa.batch342.dtos.responses.ProductResponseDto;
import com.xa.batch342.entities.Product;
import com.xa.batch342.services.ProductService;

import jakarta.validation.Valid;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@SuppressWarnings("unused")
@RestController
@RequestMapping("/api/product")
public class ProductRestController {

    @Autowired
    ProductService productService;
    
    @GetMapping("")
    public ResponseEntity<?> getAllProducts() {
        LinkedHashMap<String, Object> resultMap = new LinkedHashMap<>();
        try {
            List<ProductResponseDto> productResponseDtos = productService.getAllProducts();
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
    public ResponseEntity<?> saveCategory(@Valid @RequestBody ProductRequestDto productRequestDto) {
        LinkedHashMap<String, Object> resultMap = new LinkedHashMap<>();
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        try {
            Product product = productService.saveProduct(productRequestDto);
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
    
    @PutMapping("/{slug}")
    public ResponseEntity<?> updateProductBySlug(@PathVariable String slug, @Valid @RequestBody ProductRequestDto productRequestDto) {
        LinkedHashMap<String, Object> resultMap = new LinkedHashMap<>();
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        try {
            ProductResponseDto productResponseDto = productService.getProductBySlug(slug);
            ProductRequestDto product = modelMapper.map(productResponseDto, ProductRequestDto.class);
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

    @DeleteMapping("/{slug}")
    public ResponseEntity<?> deleteProductBySlug(@PathVariable String slug){
        LinkedHashMap<String, Object> resultMap = new LinkedHashMap<>();
        try {
            productService.deleteProductBySlug(slug);
            resultMap.put("status", 200);
            resultMap.put("message", "success");
            return new ResponseEntity<>(resultMap, HttpStatus.OK);
        } catch (Exception e) {
            resultMap.put("status", 500);
            resultMap.put("message", "failed");
            resultMap.put("error", e);
            return new ResponseEntity<>(resultMap, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
