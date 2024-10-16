package com.xa.batch342.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "products")
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class Product extends BaseEntity{

    public Product(String name, String slug, String description, Long categoryId, Boolean isDeleted){
        this.name = name;
        this.slug = slug;
        this.description = description;
        this.categoryId = categoryId;
        this.isDeleted = isDeleted;
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name", length = 50)
    private String name;

    @Column(name = "slug", length = 20, unique = true)
    private String slug;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @ManyToOne
    @JoinColumn(name = "category_id", insertable = false, updatable = false)
    public Category category;

    @Column(name = "category_id")
    private Long categoryId;

    @Column(name = "is_deleted")
    private Boolean isDeleted;
}