package com.wzzy.library.mscatalog.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CategoryDTO {
    private String id;
    private String name;
    private String description;
    private String imageUrl;
    private Integer displayOrder;
    private String createdAt;
    private String updatedAt;
}
