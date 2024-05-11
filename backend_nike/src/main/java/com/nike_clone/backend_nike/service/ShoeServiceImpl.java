package com.nike_clone.backend_nike.service;

import com.nike_clone.backend_nike.model.Shoe;
import com.nike_clone.backend_nike.repository.ShoeRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class ShoeServiceImpl implements ShoeService {

    @Autowired
    private ShoeRepository shoeRepository;

    @Override
    public Shoe addSingleShoe(Shoe shoe) {
        return shoeRepository.save(shoe);
    }

    @Override
    public List<Shoe> addShoeInBulk(List<Shoe> shoeList) {
        return shoeRepository.saveAll(shoeList);
    }

    @Override
    public Optional<Shoe> getSingleShoeById(UUID shoeId) {
        return shoeRepository.findById(shoeId);
    }

    @Override
    public List<Shoe> getAllShoes() {
        return shoeRepository.findAll();
    }
}
