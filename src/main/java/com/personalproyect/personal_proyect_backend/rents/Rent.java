package com.personalproyect.personal_proyect_backend.rents;

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
@Table(name = "rent")
@AllArgsConstructor
@Builder
@Getter
@Setter
@NoArgsConstructor
public class Rent {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)@Column(name = "id_rent")
    private Long id;

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
