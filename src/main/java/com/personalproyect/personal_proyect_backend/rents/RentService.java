package com.personalproyect.personal_proyect_backend.rents;

import java.util.List;

import org.springframework.stereotype.Service;

import com.personalproyect.personal_proyect_backend.generics.IGenericEditService;
import com.personalproyect.personal_proyect_backend.generics.IGenericGetService;

import io.micrometer.common.lang.NonNull;

@Service
public class RentService implements IGenericGetService<Rent>, IGenericEditService<RentDto, Rent>{
    
    RentRepository repository;

    public RentService(RentRepository repository) {
        this.repository = repository;
    }

    public List<Rent> getAll(){
        List<Rent> rents = repository.findAll();

        return rents;
    }

    public Rent getById(@NonNull final Long id)throws Exception{
        Rent rent = repository.findById(id).orElseThrow(() -> new RentNotFoundException("Not Found"));

        return rent;
    }

    
    public Rent save(RentDto rentDto) throws Exception {
    
        try{
            Rent newRent = Rent.builder()
                            .title(rentDto.getTitle())
                            .description(rentDto.getDescription())
                            .direction(rentDto.getDirection())
                            // .postal_code(rentDto.getPostal_code())
                            .price(rentDto.getPrice())
                            .image(rentDto.getImage())
                            .type(rentDto.getType())
                            .rooms(rentDto.getRooms())
                            .bathrooms(rentDto.getBathrooms())
                            .shortDescription(rentDto.getShortDescription())
                            .status(rentDto.getStatus())
                            .build();
            repository.save(newRent);

            Long rentTableQuantity = (long) repository.findAll().size();
            Rent rent = repository.findById(rentTableQuantity).orElseThrow(() -> new RentNotFoundException("Not Found"));
            return rent;
        } catch(Exception e){
            throw new Exception("Error al guardar" + e.getMessage());
        }
    }

    public Rent delete(Long id)throws Exception{

        Rent rentToDelete = repository.findById(id).orElseThrow(() -> new RentNotFoundException("The property does not exist"));
        repository.deleteById(id);

        return rentToDelete;
    }

    @Override
    public Rent update(RentDto rentDto, Long id) {

       Rent rent = repository.findById(id).orElseThrow(() -> new RentNotFoundException("The property does not exist"));

        rent.setTitle(rentDto.getTitle());
        rent.setDescription(rentDto.getDescription());
        rent.setRooms(rentDto.getRooms());
        rent.setBathrooms(rentDto.getBathrooms());
        rent.setShortDescription(rentDto.getShortDescription());
        rent.setStatus(rentDto.getStatus());
        rent.setImage(rentDto.getImage());
        rent.setPrice(rentDto.getPrice());
        rent.setType(rentDto.getType());
        rent.setDirection(rentDto.getDirection());
        // rent.setPostal_code(rentDto.getPostal_code());

        return repository.save(rent);
    }
    
}
