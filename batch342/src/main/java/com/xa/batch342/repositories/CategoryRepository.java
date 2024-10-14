package com.xa.batch342.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xa.batch342.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{
    
}
