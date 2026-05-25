package com.wzzy.library.mscatalog.controller;

import com.wzzy.library.bfflibrary.dto.ApiResponse;
import com.wzzy.library.bfflibrary.dto.PaginationDTO;
import com.wzzy.library.mscatalog.dto.BookDTO;
import com.wzzy.library.mscatalog.enums.BookStatus;
import com.wzzy.library.mscatalog.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping
    public ResponseEntity<ApiResponse<BookDTO>> createBook(@RequestBody BookDTO bookDTO) {
        // Implementation will be done by developer
        return null;
    }

    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse<BookDTO>> getBookById(@PathVariable String id) {
        // Implementation will be done by developer
        return null;
    }

    @GetMapping("/isbn/{isbn}")
    public ResponseEntity<ApiResponse<BookDTO>> getBookByIsbn(@PathVariable String isbn) {
        // Implementation will be done by developer
        return null;
    }

    @GetMapping
    public ResponseEntity<ApiResponse<PaginationDTO<BookDTO>>> getAllBooks(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "20") int size) {
        // Implementation will be done by developer
        return null;
    }

    @GetMapping("/status/{status}")
    public ResponseEntity<ApiResponse<PaginationDTO<BookDTO>>> getBooksByStatus(
            @PathVariable BookStatus status,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "20") int size) {
        // Implementation will be done by developer
        return null;
    }

    @GetMapping("/category/{categoryId}")
    public ResponseEntity<ApiResponse<PaginationDTO<BookDTO>>> getBooksByCategory(
            @PathVariable String categoryId,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "20") int size) {
        // Implementation will be done by developer
        return null;
    }

    @GetMapping("/author/{authorId}")
    public ResponseEntity<ApiResponse<PaginationDTO<BookDTO>>> getBooksByAuthor(
            @PathVariable String authorId,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "20") int size) {
        // Implementation will be done by developer
        return null;
    }

    @GetMapping("/search")
    public ResponseEntity<ApiResponse<PaginationDTO<BookDTO>>> searchBooks(
            @RequestParam String title,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "20") int size) {
        // Implementation will be done by developer
        return null;
    }

    @PutMapping("/{id}")
    public ResponseEntity<ApiResponse<BookDTO>> updateBook(
            @PathVariable String id,
            @RequestBody BookDTO bookDTO) {
        // Implementation will be done by developer
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse<Void>> deleteBook(@PathVariable String id) {
        // Implementation will be done by developer
        return null;
    }
}
