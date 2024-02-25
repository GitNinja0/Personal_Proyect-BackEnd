package com.personalproyect.personal_proyect_backend.rents;

public class RentException extends RuntimeException{
    
    public RentException(String message) {
        super(message);
    }

    public RentException(String message, Throwable cause) {
        super(message, cause);
    }

}
