package com.bruno.clientcrud.services.exceptions;

public class DatabaseException extends RuntimeException {
    public DatabaseException(String msg) {
      super(msg);
    }
}
