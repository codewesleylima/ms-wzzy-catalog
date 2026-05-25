package com.wzzy.library.mscatalog.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthorDTO {
    private String id;
    private String name;
    private String biography;
    private String birthDate;
    private String nationality;
    private String imageUrl;
    private String createdAt;
    private String updatedAt;
}
