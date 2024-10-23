package com.xa.batch342.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.xa.batch342.entities.Variant;

public interface VariantRepository extends JpaRepository<Variant, Long>{
    
    @Query(value = "select * from spring.variant where slug = ?1", nativeQuery = true)
    Variant getVariantBySlug(String slug);
}
