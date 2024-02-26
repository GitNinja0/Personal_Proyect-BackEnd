package com.personalproyect.personal_proyect_backend.sales;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale, Long>{
    
    public Sale findByTitle(String title);

}
