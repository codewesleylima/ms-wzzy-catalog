package com.wzzy.library.mscatalog.entity;

import com.wzzy.library.mscatalog.enums.BookStatusEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "books")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BookEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID bookId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "catalog_id")
    private CatalogEntity catalog;

    private String title;
    private String isbn;
    private String description;
    private BigDecimal price;
    private UUID authorId;
    private UUID categoryId;
    private UUID editorId;
    private Integer publicationYear;
    private Integer pageCount;
    private String language;
    private String coverUrl;
    private BookStatusEntity bookStatus;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
