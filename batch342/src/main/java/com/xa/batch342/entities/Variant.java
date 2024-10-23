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
@Data
@EqualsAndHashCode(callSuper = true)
@Table(name = "variants")
@NoArgsConstructor
public class Variant extends BaseEntity{

    public Variant(String name, String slug, String description, Long productId, Integer stock, Long price){
        this.name = name;
        this.slug = slug;
        this.description = description;
        this.productId = productId;
        this.stock = stock;
        this.price = price;
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
    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @ManyToOne
    @JoinColumn(name = "productId", insertable = false, updatable = false)
    private Product product;

    @NotBlank
    @NotNull
    @NotEmpty
    @Column(name = "productId")
    private Long productId;

    @NotBlank
    @NotNull
    @NotEmpty
    @Column(name = "stock")
    private Integer stock;

    @NotBlank
    @NotNull
    @NotEmpty
    @Column(name = "price")
    private Long price;
}
