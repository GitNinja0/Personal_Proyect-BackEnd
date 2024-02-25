package com.personalproyect.personal_proyect_backend.rents;

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
public class RentDto {
    
    private Long id;
    private String title;
    private String description;
    private String price;
    private String image;
    private String direction;
    private String type;
    private String characteristics;
    private String status;
    
}
