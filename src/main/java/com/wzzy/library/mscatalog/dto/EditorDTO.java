package com.wzzy.library.mscatalog.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EditorDTO {

    private Long id;
    private String name;
    private String country;
    private String description;
}
