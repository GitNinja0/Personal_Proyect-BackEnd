package com.personalproyect.personal_proyect_backend.file;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping(path = "${api-endpoint}")
public class FileController {
    
    private final IStorageService storageService;

    public FileController(IStorageService storageService) {
        this.storageService = storageService;
    }

    @PostMapping(path = "/images")
    public ResponseEntity<String> uploadImage(@RequestParam("file") MultipartFile file){
        storageService.store(file);
        return ResponseEntity.status(201).body("file upload succesfully");
    }
    
}
