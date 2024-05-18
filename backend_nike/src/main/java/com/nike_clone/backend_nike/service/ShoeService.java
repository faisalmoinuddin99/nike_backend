package com.nike_clone.backend_nike.service;

import com.nike_clone.backend_nike.model.Shoe;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


public interface ShoeService {

    /*
    CRUD Operations
     */
    public Shoe addSingleShoe(Shoe shoe) ;
    public List<Shoe> addShoeInBulk(List<Shoe> shoeList) ;

    public Optional<Shoe> getSingleShoeById(UUID shoeId) ;
    public List<Shoe> getAllShoes() ;
}
