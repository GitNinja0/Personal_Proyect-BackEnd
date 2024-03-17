package com.personalproyect.personal_proyect_backend.sales;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "sale")
@AllArgsConstructor
@Builder
@Getter
@Setter
@NoArgsConstructor
public class Sale {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "id_sale")
    Long id;

    private String title;

    @Column(columnDefinition = "TEXT")
    private String description;

    private int price;

    private String image;

    private String direction;

    // private int postal_code;

    private String type;

    private int rooms;

    private int bathrooms;

    @Column(columnDefinition = "TEXT")
    private String shortDescription;

    private String status;

    
}
