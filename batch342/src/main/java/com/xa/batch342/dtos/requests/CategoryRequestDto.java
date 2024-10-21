package com.xa.batch342.dtos.requests;

import lombok.Data;

@Data
public class CategoryRequestDto {
    private String name;
    private String slug;
    private String description;
    private Boolean isDeleted;
}
