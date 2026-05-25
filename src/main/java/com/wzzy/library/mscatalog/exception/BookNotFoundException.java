package com.wzzy.library.mscatalog.exception;

import com.wzzy.library.bfflibrary.exception.ResourceNotFoundException;

public class BookNotFoundException extends ResourceNotFoundException {
    public BookNotFoundException(String identifier) {
        super("Book", identifier);
    }
}
