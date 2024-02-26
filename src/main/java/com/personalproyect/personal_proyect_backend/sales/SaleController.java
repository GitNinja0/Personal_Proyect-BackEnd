package com.personalproyect.personal_proyect_backend.sales;

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
@RequestMapping(path = "${api-endpoint}/sales")
public class SaleController {
    
    SaleService service;

    public SaleController(SaleService service) {
        this.service = service;
    }

    @GetMapping(path = "")
    public List<Sale> index(){
        List<Sale> sale = service.getAll();

        return sale;
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Sale> show(@NonNull @PathVariable("id") Long id) throws Exception {
        Sale sale = service.getById(id);
        return ResponseEntity.status(HttpStatusCode.valueOf(200)).body(sale);
    }

    @PostMapping(path = "")
    public ResponseEntity<Sale> store(@RequestBody SaleDto saleDto) throws Exception {
        Sale sale = service.save(saleDto);
        return ResponseEntity.status(201).body(sale);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Sale> destroy(@PathVariable("id") Long id) throws Exception{
        Sale deleted = service.delete(id);
        return ResponseEntity.accepted().body(deleted);
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<Sale> update(@PathVariable("id") Long id, @RequestBody SaleDto saleDto){
        Sale sale = service.update(saleDto, id);
        return ResponseEntity.accepted().body(sale);
    }
}
