package com.xa.batch342.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xa.batch342.dtos.requests.VariantRequestDto;
import com.xa.batch342.dtos.responses.VariantResponseDto;
import com.xa.batch342.entities.Variant;
import com.xa.batch342.repositories.VariantRepository;
import com.xa.batch342.services.ProductService;
import com.xa.batch342.services.VariantService;

@Service
public class VariantServiceImpl implements VariantService{

    @Autowired
    VariantRepository variantRepository;

    @Autowired
    ProductService productService;

    ModelMapper modelMapper = new ModelMapper();

    @Override
    public List<VariantResponseDto> getAllVariants() {
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        List<Variant> variants = variantRepository.findAll();
        List<VariantResponseDto> variantResponseDtos = variants.stream().map(variant -> modelMapper.map(variant, VariantResponseDto.class)).collect(Collectors.toList());
        return variantResponseDtos;
    }

    @Override
    public Variant saveVariant(VariantRequestDto variantRequestDto) {
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        modelMapper.getConfiguration().setSkipNullEnabled(true);
        Variant variant = modelMapper.map(variantRequestDto, Variant.class);
        return variantRepository.save(variant);
    }

    @Override
    public VariantResponseDto getVariantBySlug(String slug) {
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        Variant variant = variantRepository.getVariantBySlug(slug);
        VariantResponseDto variantResponseDto = modelMapper.map(variant, VariantResponseDto.class);
        return variantResponseDto;
    }

    @Override
    public void deleteVariantBySlug(String slug) {
        Variant variant = variantRepository.getVariantBySlug(slug);
        variantRepository.deleteById(variant.getId());
    }
    
}
