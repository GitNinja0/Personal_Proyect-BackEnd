package com.personalproyect.personal_proyect_backend.sales;

public class SaleException extends RuntimeException{
    
    public SaleException(String message) {
        super(message);
    }

    public SaleException(String message, Throwable cause) {
        super(message, cause);
    }
}
