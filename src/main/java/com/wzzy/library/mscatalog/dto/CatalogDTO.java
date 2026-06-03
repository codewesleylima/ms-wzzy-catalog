package com.wzzy.library.mscatalog.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CatalogDTO {

    private UUID catalogIdDTO;
    private String catalogNameDTO;
    private String descriptionDTO;
    private String statusDTO;
    private List<BookDTO> booksDTO;
    private LocalDateTime createdAtDTO;
    private LocalDateTime updatedAtDTO;
}
