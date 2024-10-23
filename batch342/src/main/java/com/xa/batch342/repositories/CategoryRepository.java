package com.xa.batch342.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.xa.batch342.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{
    
    @Query(value = "select c from Category c where isDeleted = false")
    List<Category> getAllCategories();
}
