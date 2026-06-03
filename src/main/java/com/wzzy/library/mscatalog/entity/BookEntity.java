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
    private UUID bookIdEntity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "catalog_id")
    private CatalogEntity catalogEntity;

    private String titleEntity;
    private String isbnEntity;
    private String descriptionEntity;
    private BigDecimal priceEntity;
    private UUID authorIdEntity;
    private UUID categoryIdEntity;
    private UUID editorIdEntity;
    private Integer publicationYearEntity;
    private Integer pageCountEntity;
    private String languageEntity;
    private String coverUrlEntity;
    private BookStatusEntity bookStatusEntity;
    private LocalDateTime createdAtEntity;
    private LocalDateTime updatedAtEntity;
}
