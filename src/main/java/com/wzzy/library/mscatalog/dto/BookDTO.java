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

    private UUID id;
    private String title;
    private String isbn;
    private String description;
    private BigDecimal price;
    private Long authorId;
    private Long categoryId;
    private Long editorId;
    private Integer publicationYear;
    private Integer pageCount;
    private String language;
    private String coverUrl;
    private String status;
}
