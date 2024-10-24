package com.xa.batch342.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xa.batch342.dtos.requests.CategoryRequestDto;
import com.xa.batch342.dtos.responses.CategoryResponseDto;
import com.xa.batch342.entities.Category;
import com.xa.batch342.repositories.CategoryRepository;
import com.xa.batch342.services.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService{

    @Autowired
    CategoryRepository categoryRepository;
    
    ModelMapper modelMapper = new ModelMapper();
    
    @Override
    public List<CategoryResponseDto> getAllCategories() {
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        List<Category> categories = categoryRepository.findAll();
        List<CategoryResponseDto> categoryResponseDtos = categories.stream().map(category -> modelMapper.map(category, CategoryResponseDto.class)).collect(Collectors.toList());
        return categoryResponseDtos;   
    }

    @Override
    public CategoryResponseDto getCategoryBySlug(String slug) {
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        Category category = categoryRepository.getCategoryBySlug(slug);
        CategoryResponseDto categoryResponseDto = modelMapper.map(category, CategoryResponseDto.class);
        return categoryResponseDto;
    }

    @Override
    public Category saveCategory(CategoryRequestDto categoryRequestDto) {
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        modelMapper.getConfiguration().setSkipNullEnabled(true);
        Category category = modelMapper.map(categoryRequestDto, Category.class);
        return categoryRepository.save(category);
    }

    @Override
    public void deleteCategory(String slug) {
        Category category = categoryRepository.getCategoryBySlug(slug);
        categoryRepository.deleteById(category.getId());
    }
    
}
