package com.personalproyect.personal_proyect_backend.sales;

public class SaleNotFoundException extends SaleException{
    
    public SaleNotFoundException(String message) {
        super(message);
    }

    public SaleNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
