package com.personalproyect.personal_proyect_backend.generics;

public interface IGenericEditService<T, R> {
    
    R save(T type) throws Exception;
    R update(T type, Long id);
    
}
