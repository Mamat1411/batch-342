package com.xa.batch342.services;

import java.util.List;

import com.xa.batch342.entities.Variant;

public interface VariantService {
    List<Variant> getAllVariants();
    Variant saveVariant(Variant variant);
    Variant getVariantBySlug(String slug);
    void deleteVariantBySlug(String slug);
}
