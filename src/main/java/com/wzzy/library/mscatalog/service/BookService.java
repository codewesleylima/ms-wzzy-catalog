package com.wzzy.library.mscatalog.service;

import com.wzzy.library.bfflibrary.dto.PaginationDTO;
import com.wzzy.library.mscatalog.dto.BookDTO;
import com.wzzy.library.mscatalog.enums.BookStatus;

public interface BookService {
    BookDTO createBook(BookDTO bookDTO);
    BookDTO getBookById(String id);
    BookDTO getBookByIsbn(String isbn);
    PaginationDTO<BookDTO> getAllBooks(int page, int size);
    PaginationDTO<BookDTO> getBooksByStatus(BookStatus status, int page, int size);
    PaginationDTO<BookDTO> getBooksByCategory(String categoryId, int page, int size);
    PaginationDTO<BookDTO> getBooksByAuthor(String authorId, int page, int size);
    PaginationDTO<BookDTO> searchBooksByTitle(String title, int page, int size);
    BookDTO updateBook(String id, BookDTO bookDTO);
    void deleteBook(String id);
}
