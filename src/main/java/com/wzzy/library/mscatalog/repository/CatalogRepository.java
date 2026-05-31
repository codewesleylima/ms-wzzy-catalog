package com.wzzy.library.mscatalog.repository;

import com.wzzy.library.mscatalog.entity.CatalogEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CatalogRepository extends JpaRepository<CatalogEntity, UUID> {
}
