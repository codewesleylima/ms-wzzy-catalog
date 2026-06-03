package com.wzzy.library.mscatalog.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookDTO {

    private UUID bookIdDTO;
    private String titleDTO;
    private String isbnDTO;
    private String descriptionDTO;
    private BigDecimal priceDTO;
    private Long authorIdDTO;
    private Long categoryIdDTO;
    private Long editorIdDTO;
    private Integer publicationYearDTO;
    private Integer pageCountDTO;
    private String languageDTO;
    private String coverUrlDTO;
    private String statusDTO;
}
