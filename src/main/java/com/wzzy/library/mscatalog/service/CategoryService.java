package com.wzzy.library.mscatalog.service;

import com.wzzy.library.bfflibrary.dto.PaginationDTO;
import com.wzzy.library.mscatalog.dto.CategoryDTO;

public interface CategoryService {
    CategoryDTO createCategory(CategoryDTO categoryDTO);
    CategoryDTO getCategoryById(String id);
    PaginationDTO<CategoryDTO> getAllCategories(int page, int size);
    CategoryDTO updateCategory(String id, CategoryDTO categoryDTO);
    void deleteCategory(String id);
}
