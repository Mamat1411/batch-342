package com.xa.batch342.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xa.batch342.dtos.requests.VariantRequestDto;
import com.xa.batch342.dtos.responses.CategoryResponseDto;
import com.xa.batch342.dtos.responses.ProductResponseDto;
import com.xa.batch342.dtos.responses.VariantResponseDto;
import com.xa.batch342.services.CategoryService;
import com.xa.batch342.services.ProductService;
import com.xa.batch342.services.VariantService;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.PostMapping;




@Controller
@RequestMapping("/variant")
public class VariantController {
    
    @Autowired
    VariantService variantService;

    @Autowired
    CategoryService categoryService;

    @Autowired
    ProductService productService;

    @GetMapping("")
    public ModelAndView getVariant() {
        ModelAndView view = new ModelAndView("variant/index");
        List<VariantResponseDto> variantResponseDtos = variantService.getAllVariants();
        view.addObject("title", "Master Variant");
        view.addObject("variants", variantResponseDtos);
        return view;
    }
    
    @GetMapping("/form")
    public ModelAndView form() {
        ModelAndView view = new ModelAndView("variant/form");
        VariantResponseDto variantResponseDto = new VariantResponseDto();
        List<CategoryResponseDto> categoryResponseDtos = categoryService.getAllCategories();
        List<ProductResponseDto> productResponseDtos = productService.getAllProducts();
        view.addObject("variant", variantResponseDto);
        view.addObject("categories", categoryResponseDtos);
        view.addObject("products", productResponseDtos);
        return view;
    }
    
    @GetMapping("/productlist/{id}")
    @ResponseBody
    public List<ProductResponseDto> getProductListByCategoryId(@PathVariable Long id){
        List<ProductResponseDto> productResponseDtos = productService.getProductsByCategoryId(id);
        return productResponseDtos;
    }

    @PostMapping("/save")
    public ModelAndView saveVariant(@Valid @ModelAttribute VariantRequestDto variant, BindingResult result) {
        if (!result.hasErrors()) {
            variantService.saveVariant(variant);
        }
        return new ModelAndView("redirect:/variant");
    }
 
    @GetMapping("/edit/{slug}")
    public ModelAndView edit(@PathVariable String slug) {
        ModelAndView view = new ModelAndView("variant/form");
        VariantResponseDto variant = variantService.getVariantBySlug(slug);
        List<CategoryResponseDto> categories = categoryService.getAllCategories();
        List<ProductResponseDto> productResponseDtos = productService.getProductsByCategoryId(variant.getProductId());
        view.addObject("categories", categories);
        view.addObject("variant", variant);
        view.addObject("products", productResponseDtos);
        return view;
    }
    
    @GetMapping("/deleteForm/{slug}")
    public ModelAndView deleteForm(@PathVariable String slug) {
        ModelAndView view = new ModelAndView("variant/deleteForm");
        VariantResponseDto variant = variantService.getVariantBySlug(slug);
        view.addObject("variant", variant);
        return view;
    }
    
    @GetMapping("/delete/{slug}")
    public ModelAndView deleteCategory(@PathVariable String slug) {
        variantService.deleteVariantBySlug(slug);
        return new ModelAndView("redirect:/variant");
    }
    
}
