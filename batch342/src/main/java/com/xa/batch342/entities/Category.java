package com.xa.batch342.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@EqualsAndHashCode(callSuper = true)
@Data
@Table(name = "categories")
@NoArgsConstructor
public class Category extends BaseEntity {

    public Category(String name, String slug, String description){
        this.name = name;
        this.slug = slug;
        this.description = description;
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
    @Column(name = "slug", length = 50, unique = true)
    private String slug;

    @NotBlank
    @NotNull
    @NotEmpty
    @Column(name = "description")
    private String description;
}
