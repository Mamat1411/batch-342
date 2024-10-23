package com.xa.batch342.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.xa.batch342.dtos.responses.ProductResponseDto;
import com.xa.batch342.entities.Category;
import com.xa.batch342.entities.Product;
import com.xa.batch342.services.CategoryService;
import com.xa.batch342.services.ProductService;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;


@Controller
@RequestMapping("/product")
public class ProductController {
    
    @Autowired
    ProductService productService;

    @Autowired
    CategoryService categoryService;

    @GetMapping("")
    public ModelAndView getProduct() {
        ModelMapper modelMapper = new ModelMapper();
        ModelAndView view = new ModelAndView("product/index");
        List<Product> products = productService.getAllProducts();
        List<ProductResponseDto> productResponseDtos = products.stream().map(product -> modelMapper.map(product, ProductResponseDto.class)).collect(Collectors.toList());
        view.addObject("title", "Master Product");
        view.addObject("products", productResponseDtos);
        return view;
    }
    
    @GetMapping("/form")
    public ModelAndView form() {
        ModelAndView view = new ModelAndView("product/form");
        Product product = new Product();
        List<Category> categories = categoryService.getAllCategories();
        view.addObject("categories", categories);
        view.addObject("product", product);
        return view;
    }
    
    @PostMapping("/save")
    public ModelAndView save(@Valid @ModelAttribute Product product, BindingResult result) {
        if (!result.hasErrors()) {
            productService.saveProduct(product);
        }
        return new ModelAndView("redirect:/product");
    }
 
    @GetMapping("/edit/{slug}")
    public ModelAndView edit(@PathVariable String slug) {
        ModelAndView view = new ModelAndView("product/form");
        Product product = productService.getProductBySlug(slug);
        List<Category> categories = categoryService.getAllCategories();
        view.addObject("categories", categories);
        view.addObject("product", product);
        return view;
    }
    
    @GetMapping("/deleteForm/{slug}")
    public ModelAndView deleteForm(@PathVariable String slug) {
        ModelAndView view = new ModelAndView("product/deleteForm");
        Product product = productService.getProductBySlug(slug);
        view.addObject("product", product);
        return view;
    }
    
    @GetMapping("/delete/{slug}")
    public ModelAndView deleteCategory(@PathVariable String slug) {
        productService.deleteProductBySlug(slug);
        return new ModelAndView("redirect:/category");
    }
}
