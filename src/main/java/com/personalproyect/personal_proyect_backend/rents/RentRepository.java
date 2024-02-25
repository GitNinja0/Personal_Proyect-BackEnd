package com.personalproyect.personal_proyect_backend.rents;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RentRepository extends JpaRepository<Rent, Long>{
    
    public Rent findByTitle(String title);
}
