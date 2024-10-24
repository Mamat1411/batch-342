package com.xa.batch342.controllers;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.xa.batch342.dtos.requests.CategoryRequestDto;
import com.xa.batch342.dtos.responses.CategoryResponseDto;
import com.xa.batch342.services.CategoryService;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    ModelMapper modelMapper = new ModelMapper();
    
    @GetMapping("")
    public ModelAndView getCategory() {
        ModelAndView view = new ModelAndView("category/index");
        List<CategoryResponseDto> categories = categoryService.getAllCategories();
        view.addObject("categories", categories);
        view.addObject("title", "Master Category");
        return view;
    }

    @GetMapping("/form")
    public ModelAndView form() {
        ModelAndView view = new ModelAndView("category/form");
        CategoryRequestDto category = new CategoryRequestDto();
        view.addObject("category", category);
        return view;
    }
    
    @PostMapping("/save")
    public ModelAndView save(@Valid @ModelAttribute CategoryRequestDto category, BindingResult result) {
        if (!result.hasErrors()) {
            categoryService.saveCategory(category);
        }
        return new ModelAndView("redirect:/category");
    }
    
    @GetMapping("/edit/{slug}")
    public ModelAndView edit(@Valid @PathVariable String slug) {
        ModelAndView view = new ModelAndView("category/form");
        CategoryResponseDto categoryResponseDto = categoryService.getCategoryBySlug(slug);
        view.addObject("category", categoryResponseDto);
        return view;
    }
    
    @GetMapping("/deleteForm/{slug}")
    public ModelAndView deleteForm(@PathVariable String slug) {
        ModelAndView view = new ModelAndView("category/deleteForm");
        CategoryResponseDto categoryResponseDto = categoryService.getCategoryBySlug(slug);
        view.addObject("category", categoryResponseDto);
        return view;
    }
    
    @GetMapping("/delete/{slug}")
    public ModelAndView deleteCategory(@PathVariable String slug) {
        categoryService.deleteCategory(slug);
        return new ModelAndView("redirect:/category");
    }
    
}
