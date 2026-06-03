package com.wzzy.library.mscatalog.service;

import com.wzzy.library.mscatalog.repository.CatalogRepository;
import org.springframework.stereotype.Service;

@Service
public class CatalogServiceImpl implements CatalogService {

    private final CatalogRepository catalogRepository;

    public CatalogServiceImpl(CatalogRepository catalogRepository) {
        this.catalogRepository = catalogRepository;
    }

    public Catalog
}
