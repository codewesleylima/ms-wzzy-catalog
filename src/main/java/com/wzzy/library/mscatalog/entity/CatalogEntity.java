package com.wzzy.library.mscatalog.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "catalogs")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CatalogEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID catalogIdEntity;

    private String catalogNameEntity;
    private String descriptionEntity;
    private String statusEntity;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "catalog_id")
    private List<BookEntity> booksEntity;

    @Column(nullable = false)
    private LocalDateTime createdAtEntity = LocalDateTime.now();

    @Column(nullable = false)
    private LocalDateTime updatedAtEntity = LocalDateTime.now();
}
