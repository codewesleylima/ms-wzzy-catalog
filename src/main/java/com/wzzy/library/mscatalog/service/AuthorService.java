package com.wzzy.library.mscatalog.service;

import com.wzzy.library.bfflibrary.dto.PaginationDTO;
import com.wzzy.library.mscatalog.dto.AuthorDTO;

public interface AuthorService {
    AuthorDTO createAuthor(AuthorDTO authorDTO);
    AuthorDTO getAuthorById(String id);
    PaginationDTO<AuthorDTO> getAllAuthors(int page, int size);
    AuthorDTO updateAuthor(String id, AuthorDTO authorDTO);
    void deleteAuthor(String id);
}
