package com.xa.batch342.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "products")
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class Product extends BaseEntity{

    public Product(String name, String slug, String description, Long categoryId){
        this.name = name;
        this.slug = slug;
        this.description = description;
        this.categoryId = categoryId;
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotBlank
    @NotNull
    @NotEmpty
    @Column(name = "name", length = 50)
    private String name;

    @NotBlank
    @NotNull
    @NotEmpty
    @Column(name = "slug", length = 20, unique = true)
    private String slug;

    @NotBlank
    @NotNull
    @NotEmpty
    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @ManyToOne
    @JoinColumn(name = "category_id", insertable = false, updatable = false)
    private Category category;

    @NotBlank
    @NotNull
    @NotEmpty
    @Column(name = "category_id")
    private Long categoryId;
}
