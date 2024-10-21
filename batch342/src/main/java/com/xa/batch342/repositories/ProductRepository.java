package com.xa.batch342.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.xa.batch342.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    
    // Native Query
    // @Query(value = "select * from spring.products where is_deleted = false", nativeQuery = true)
    // List<Product> getAllProducts();

    // Hibernate Query
    @Query(value = "select p from Product p where isDeleted = false")
    List<Product> getAllProducts();

    @Query(value = "select * from spring.products where is_deleted = false and slug = ?1", nativeQuery = true)
    Product getProductBySlug(String Slug);
}
