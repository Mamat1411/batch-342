package com.xa.batch342.controllers;

import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xa.batch342.entities.Category;
import com.xa.batch342.repositories.CategoryRepository;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api/category")
public class CategoryRestController {
    
    @Autowired
    CategoryRepository categoryRepository;

    @GetMapping("")
    public ResponseEntity<?> getAllCategories() {
        LinkedHashMap<String, Object> resultMap = new LinkedHashMap<>();
        List<Category> categories = categoryRepository.findAll();
        resultMap.put("status", 200);
        resultMap.put("message", "success");
        resultMap.put("data", categories);
        return new ResponseEntity<>(resultMap, HttpStatus.OK);
    }
    
}
