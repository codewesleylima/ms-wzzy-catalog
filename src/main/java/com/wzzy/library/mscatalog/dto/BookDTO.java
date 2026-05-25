package com.wzzy.library.mscatalog.dto;

import com.wzzy.library.mscatalog.enums.BookStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookDTO {
    private String id;
    private String title;
    private String isbn;
    private String description;
    private BigDecimal basePrice;
    private String imageUrl;
    private BookStatus status;
    private String categoryId;
    private String categoryName;
    private String authorId;
    private String authorName;
    private String editorId;
    private String editorName;
    private String language;
    private String format;
    private Integer pageCount;
    private String publicationDate;
    private String edition;
    private String createdAt;
    private String updatedAt;
}
