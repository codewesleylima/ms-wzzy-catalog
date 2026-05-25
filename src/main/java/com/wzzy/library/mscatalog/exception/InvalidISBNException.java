package com.wzzy.library.mscatalog.exception;

import com.wzzy.library.bfflibrary.exception.ValidationException;

public class InvalidISBNException extends ValidationException {
    public InvalidISBNException(String isbn) {
        super("Invalid ISBN format: " + isbn, "INVALID_ISBN");
    }
}
