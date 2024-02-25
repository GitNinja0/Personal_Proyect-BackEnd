package com.personalproyect.personal_proyect_backend.generics;

public interface IGenericGetService<T> {
    
    T getById(Long id) throws Exception;
}
