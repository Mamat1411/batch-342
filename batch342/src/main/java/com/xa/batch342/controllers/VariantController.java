package com.xa.batch342.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xa.batch342.dtos.responses.VariantResponseDto;
import com.xa.batch342.services.VariantService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/variant")
public class VariantController {
    
    @Autowired
    VariantService variantService;

    @GetMapping("")
    public ModelAndView getVariant() {
        ModelAndView view = new ModelAndView("variant/index");
        List<VariantResponseDto> variantResponseDtos = variantService.getAllVariants();
        view.addObject("title", "Master Variant");
        view.addObject("variants", variantResponseDtos);
        return view;
    }
    
}
