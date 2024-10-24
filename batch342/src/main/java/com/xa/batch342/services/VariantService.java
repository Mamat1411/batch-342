package com.xa.batch342.services;

import java.util.List;

import com.xa.batch342.dtos.requests.VariantRequestDto;
import com.xa.batch342.dtos.responses.VariantResponseDto;
import com.xa.batch342.entities.Variant;

public interface VariantService {
    List<VariantResponseDto> getAllVariants();
    Variant saveVariant(VariantRequestDto variantRequestDto);
    VariantResponseDto getVariantBySlug(String slug);
    void deleteVariantBySlug(String slug);
}
