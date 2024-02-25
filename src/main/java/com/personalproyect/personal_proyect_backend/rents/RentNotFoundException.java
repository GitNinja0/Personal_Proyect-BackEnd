package com.personalproyect.personal_proyect_backend.rents;

public class RentNotFoundException extends RentException{
    
    public RentNotFoundException(String message) {
        super(message);
    }

    public RentNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
