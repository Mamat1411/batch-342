package com.xa.batch342.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.xa.batch342.entities.Variant;
import com.xa.batch342.repositories.VariantRepository;
import com.xa.batch342.services.VariantService;

public class VariantServiceImpl implements VariantService{

    @Autowired
    VariantRepository variantRepository;

    @Override
    public List<Variant> getAllVariants() {
        return variantRepository.findAll();
    }

    @Override
    public Variant saveVariant(Variant variant) {
        return variantRepository.save(variant);
    }

    @Override
    public Variant getVariantBySlug(String slug) {
        return variantRepository.getVariantBySlug(slug);
    }

    @Override
    public void deleteVariantBySlug(String slug) {
        Variant variant = variantRepository.getVariantBySlug(slug);
        variantRepository.deleteById(variant.getId());
    }
    
}
