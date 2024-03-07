package com.personalproyect.personal_proyect_backend.file;

import org.springframework.web.multipart.MultipartFile;

public interface IStorageService {

    void store(MultipartFile file);
    
}
