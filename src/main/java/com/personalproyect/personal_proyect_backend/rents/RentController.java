package com.personalproyect.personal_proyect_backend.rents;


import java.util.List;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.micrometer.common.lang.NonNull;

@RestController
@RequestMapping(path = "${api-endpoint}/rents")
public class RentController {
    
    RentService service;

    public RentController(RentService service) {
        this.service = service;
    }

    @GetMapping(path = "")
    public List<Rent> index(){
        List<Rent> rents = service.getAll();

        return rents;
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Rent> show(@NonNull @PathVariable("id") Long id) throws Exception {
        Rent rent = service.getById(id);
        return ResponseEntity.status(HttpStatusCode.valueOf(200)).body(rent);
    }

    @PostMapping(path = "")
    public ResponseEntity<Rent> store(@RequestBody RentDto rentDto) throws Exception {
        Rent rent = service.save(rentDto);
        return ResponseEntity.status(201).body(rent);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Rent> destroy(@PathVariable("id") Long id) throws Exception{
        Rent deleted = service.delete(id);
        return ResponseEntity.accepted().body(deleted);
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<Rent> update(@PathVariable("id") Long id, @RequestBody RentDto rentDto){
        Rent rent = service.update(rentDto, id);
        return ResponseEntity.accepted().body(rent);
    }
}
