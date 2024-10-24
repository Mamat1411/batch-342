package com.xa.batch342.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.xa.batch342.dtos.requests.ProductRequestDto;
import com.xa.batch342.dtos.responses.CategoryResponseDto;
import com.xa.batch342.dtos.responses.ProductResponseDto;
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
        ModelAndView view = new ModelAndView("product/index");
        List<ProductResponseDto> productResponseDtos = productService.getAllProducts();
        view.addObject("title", "Master Product");
        view.addObject("products", productResponseDtos);
        return view;
    }
    
    @GetMapping("/form")
    public ModelAndView form() {
        ModelAndView view = new ModelAndView("product/form");
        ProductResponseDto product = new ProductResponseDto();
        List<CategoryResponseDto> categories = categoryService.getAllCategories();
        view.addObject("categories", categories);
        view.addObject("product", product);
        return view;
    }
    
    @PostMapping("/save")
    public ModelAndView save(@Valid @ModelAttribute ProductRequestDto product, BindingResult result) {
        System.out.println(product);
        System.out.println(result);
        if (!result.hasErrors()) {
            productService.saveProduct(product);
        }
        return new ModelAndView("redirect:/product");
    }
 
    @GetMapping("/edit/{slug}")
    public ModelAndView edit(@PathVariable String slug) {
        ModelAndView view = new ModelAndView("product/form");
        ProductResponseDto product = productService.getProductBySlug(slug);
        List<CategoryResponseDto> categories = categoryService.getAllCategories();
        view.addObject("categories", categories);
        view.addObject("product", product);
        return view;
    }
    
    @GetMapping("/deleteForm/{slug}")
    public ModelAndView deleteForm(@PathVariable String slug) {
        ModelAndView view = new ModelAndView("product/deleteForm");
        ProductResponseDto product = productService.getProductBySlug(slug);
        view.addObject("product", product);
        return view;
    }
    
    @GetMapping("/delete/{slug}")
    public ModelAndView deleteCategory(@PathVariable String slug) {
        productService.deleteProductBySlug(slug);
        return new ModelAndView("redirect:/category");
    }
}
