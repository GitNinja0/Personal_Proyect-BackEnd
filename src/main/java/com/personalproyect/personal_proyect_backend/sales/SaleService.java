package com.personalproyect.personal_proyect_backend.sales;

import java.util.List;

import org.springframework.stereotype.Service;

import com.personalproyect.personal_proyect_backend.generics.IGenericEditService;
import com.personalproyect.personal_proyect_backend.generics.IGenericGetService;

import io.micrometer.common.lang.NonNull;

@Service
public class SaleService implements IGenericGetService<Sale>, IGenericEditService<SaleDto, Sale>{
    
    SaleRepository repository;

    public SaleService(SaleRepository repository) {
        this.repository = repository;
    }

    public List<Sale> getAll(){
        List<Sale> sale = repository.findAll();

        return sale;
    }
    
    public Sale getById(@NonNull final Long id) throws Exception {
        Sale sale = repository.findById(id).orElseThrow(() -> new SaleNotFoundException("Not Found"));

        return sale;
    }

    public Sale save(SaleDto saleDto) throws Exception {
         
        try{
            Sale newSale = Sale.builder()
                                .title(saleDto.getTitle())
                                .description(saleDto.getDescription())
                                .direction(saleDto.getDirection())
                                .price(saleDto.getPrice())
                                .image(saleDto.getImage())
                                .type(saleDto.getType())
                                .rooms(saleDto.getRooms())
                                .bathrooms(saleDto.getBathrooms())
                                // .postal_code(saleDto.getPostal_code())
                                .shortDescription(saleDto.getShortDescription())
                                .status(saleDto.getStatus())
                                .build();
                    repository.save(newSale);

                    Long saleTableQuantity = (long) repository.findAll().size();
                    Sale sale = repository.findById(saleTableQuantity).orElseThrow(() -> new SaleNotFoundException("Not Found"));
                    return sale;
         } catch(Exception e){
            throw new Exception("Error al guardar" + e.getMessage());
         }
    }

    @Override
    public Sale update(SaleDto saleDto, Long id) {
        
        Sale sale = repository.findById(id).orElseThrow(() -> new SaleNotFoundException("The property does not exist"));

        sale.setTitle(saleDto.getTitle());
        sale.setDescription(saleDto.getDescription());
        sale.setBathrooms(saleDto.getBathrooms());
        sale.setRooms(saleDto.getRooms());
        sale.setShortDescription(saleDto.getShortDescription());
        // sale.setPostal_code(saleDto.getPostal_code());
        sale.setStatus(saleDto.getStatus());
        sale.setImage(saleDto.getImage());
        sale.setPrice(saleDto.getPrice());
        sale.setType(saleDto.getType());
        sale.setDirection(saleDto.getDirection());

        return repository.save(sale);
    }
   
    public Sale delete(Long id)throws Exception{

        Sale saleToDelete = repository.findById(id).orElseThrow(() -> new SaleNotFoundException("The property does not exist"));

        return saleToDelete;
    }
    

    
}
