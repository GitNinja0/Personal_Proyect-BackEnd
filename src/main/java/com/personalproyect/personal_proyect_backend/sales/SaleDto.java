package com.personalproyect.personal_proyect_backend.sales;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SaleDto {
 
    private Long id;
    private String title;
    private String description;
    private int price;
    private String image;
    private String direction;
    // private int postal_code;
    private String type;
    private int rooms;
    private int bathrooms;
    private String shortDescription;
    private String status;

}
