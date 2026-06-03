package com.wzzy.library.mscatalog.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthorDTO {

    private UUID authorIdDTO;
    private String nameDTO;
}
