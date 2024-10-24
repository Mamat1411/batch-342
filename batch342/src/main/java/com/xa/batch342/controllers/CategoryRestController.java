package com.xa.batch342.controllers;

import java.util.LinkedHashMap;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xa.batch342.dtos.requests.CategoryRequestDto;
import com.xa.batch342.dtos.responses.CategoryResponseDto;
import com.xa.batch342.entities.Category;
import com.xa.batch342.services.CategoryService;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/api/category")
public class CategoryRestController {
    
    @Autowired
    CategoryService categoryService;

    @GetMapping("")
    public ResponseEntity<?> getAllCategories() {
        LinkedHashMap<String, Object> resultMap = new LinkedHashMap<>();
        try {
            List<CategoryResponseDto> categoryResponseDtos = categoryService.getAllCategories();
            resultMap.put("status", 200);
            resultMap.put("message", "success");
            resultMap.put("data", categoryResponseDtos);
            return new ResponseEntity<>(resultMap, HttpStatus.OK);
        } catch (Exception e) {
            resultMap.put("status", 500);
            resultMap.put("message", "success");
            resultMap.put("error", e);
            return new ResponseEntity<>(resultMap, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    @GetMapping("/{slug}")
    public ResponseEntity<?> getCategoryBySlug(@PathVariable String slug) {
        LinkedHashMap<String, Object> resultMap = new LinkedHashMap<>();
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        try {
            CategoryResponseDto categoryResponseDto = categoryService.getCategoryBySlug(slug);
            resultMap.put("status", 200);
            resultMap.put("message", "success");
            resultMap.put("data", categoryResponseDto);
            return new ResponseEntity<>(resultMap, HttpStatus.OK);
        } catch (Exception e) {
            resultMap.put("status", 500);
            resultMap.put("message", "success");
            resultMap.put("error", e);
            return new ResponseEntity<>(resultMap, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    @PostMapping("")
    public ResponseEntity<?> saveCategory(@Valid @RequestBody CategoryRequestDto categoryRequestDto) {
        LinkedHashMap<String, Object> resultMap = new LinkedHashMap<>();
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        try {
            Category category = categoryService.saveCategory(categoryRequestDto);
            resultMap.put("status", 200);
            resultMap.put("message", "success");
            resultMap.put("data", category);
            return new ResponseEntity<>(resultMap, HttpStatus.OK);
        } catch (Exception e) {
            resultMap.put("status", 500);
            resultMap.put("message", "success");
            resultMap.put("error", e);
            return new ResponseEntity<>(resultMap, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    @PutMapping("/{slug}")
    public ResponseEntity<?> updateCategory(@PathVariable String slug, @Valid @RequestBody CategoryRequestDto categoryRequestDto) {
        LinkedHashMap<String, Object> resultMap = new LinkedHashMap<>();
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        try {
            CategoryResponseDto categoryResponseDto = categoryService.getCategoryBySlug(slug);
            CategoryRequestDto category = modelMapper.map(categoryResponseDto, CategoryRequestDto.class);
            categoryService.saveCategory(categoryRequestDto);
            resultMap.put("status", 200);
            resultMap.put("message", "success");
            resultMap.put("data", category);
            return new ResponseEntity<>(resultMap, HttpStatus.OK);
        } catch (Exception e) {
            resultMap.put("status", 500);
            resultMap.put("message", "success");
            resultMap.put("error", e);
            return new ResponseEntity<>(resultMap, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PatchMapping("/{slug}")
    public ResponseEntity<?> updateCategoryByField(@PathVariable String slug, @Valid @RequestBody CategoryRequestDto categoryRequestDto) {
        LinkedHashMap<String, Object> resultMap = new LinkedHashMap<>();
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        modelMapper.getConfiguration().setSkipNullEnabled(true);
        try {
            CategoryResponseDto categoryResponseDto = categoryService.getCategoryBySlug(slug);
            CategoryRequestDto category = modelMapper.map(categoryResponseDto, CategoryRequestDto.class);
            categoryService.saveCategory(categoryRequestDto);
            resultMap.put("status", 200);
            resultMap.put("message", "success");
            resultMap.put("data", category);
            return new ResponseEntity<>(resultMap, HttpStatus.OK);
        } catch (Exception e) {
            resultMap.put("status", 500);
            resultMap.put("message", "success");
            resultMap.put("error", e);
            return new ResponseEntity<>(resultMap, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/{slug}")
    public ResponseEntity<?> deleteProductBySlug(@PathVariable String slug){
        LinkedHashMap<String, Object> resultMap = new LinkedHashMap<>();
        try {
            categoryService.deleteCategory(slug);
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
