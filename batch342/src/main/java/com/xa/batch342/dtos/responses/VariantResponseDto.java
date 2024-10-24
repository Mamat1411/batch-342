package com.xa.batch342.dtos.responses;

import lombok.Data;

@Data
public class VariantResponseDto {
    private Long id;
    private Long productId;
    private String name;
    private String slug;
    private String description;
    private Integer stock;
    private Long price;
    private ProductResponseDto product;
}
