package com.xa.batch342.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.xa.batch342.entities.Category;
import com.xa.batch342.repositories.CategoryRepository;
import com.xa.batch342.services.CategoryService;

public class CategoryServiceImpl implements CategoryService{

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();   
    }

    @Override
    public Category getCategoryById(Long id) {
        return categoryRepository.findById(id).orElse(null);
    }

    @Override
    public Category saveCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public void deleteCategory(Long id) {
        Category category = categoryRepository.findById(id).orElse(null);
        categoryRepository.deleteById(category.getId());
    }
    
}
