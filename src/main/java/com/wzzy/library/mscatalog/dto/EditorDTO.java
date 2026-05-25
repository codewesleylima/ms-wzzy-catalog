package com.wzzy.library.mscatalog.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EditorDTO {
    private String id;
    private String name;
    private String website;
    private String address;
    private String phone;
    private String email;
    private String description;
    private String createdAt;
    private String updatedAt;
}
