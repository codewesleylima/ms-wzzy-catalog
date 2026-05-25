package com.wzzy.library.mscatalog.controller;

import com.wzzy.library.bfflibrary.dto.ApiResponse;
import com.wzzy.library.bfflibrary.dto.PaginationDTO;
import com.wzzy.library.mscatalog.dto.CategoryDTO;
import com.wzzy.library.mscatalog.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping
    public ResponseEntity<ApiResponse<CategoryDTO>> createCategory(@RequestBody CategoryDTO categoryDTO) {
        // Implementation will be done by developer
        return null;
    }

    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse<CategoryDTO>> getCategoryById(@PathVariable String id) {
        // Implementation will be done by developer
        return null;
    }

    @GetMapping
    public ResponseEntity<ApiResponse<PaginationDTO<CategoryDTO>>> getAllCategories(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "20") int size) {
        // Implementation will be done by developer
        return null;
    }

    @PutMapping("/{id}")
    public ResponseEntity<ApiResponse<CategoryDTO>> updateCategory(
            @PathVariable String id,
            @RequestBody CategoryDTO categoryDTO) {
        // Implementation will be done by developer
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse<Void>> deleteCategory(@PathVariable String id) {
        // Implementation will be done by developer
        return null;
    }
}
