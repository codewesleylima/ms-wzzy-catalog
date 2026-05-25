package com.wzzy.library.mscatalog.repository;

import com.wzzy.library.mscatalog.entity.Book;
import com.wzzy.library.mscatalog.enums.BookStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<Book, String> {
    Optional<Book> findByIsbn(String isbn);
    Page<Book> findByStatus(BookStatus status, Pageable pageable);
    Page<Book> findByAuthorId(String authorId, Pageable pageable);
    Page<Book> findByCategoryId(String categoryId, Pageable pageable);
    Page<Book> findByTitleContainingIgnoreCase(String title, Pageable pageable);
    List<Book> findByAuthorIdAndStatus(String authorId, BookStatus status);
}
