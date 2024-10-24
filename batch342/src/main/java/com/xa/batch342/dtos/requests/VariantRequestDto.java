package com.xa.batch342.dtos.requests;

import lombok.Data;

@Data
public class VariantRequestDto {
    private Long id;
    private Long productId;
    private String name;
    private String slug;
    private String description;
    private Integer stock;
    private Long price;
}
