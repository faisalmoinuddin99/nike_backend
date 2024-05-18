package com.nike_clone.backend_nike.service;

import com.nike_clone.backend_nike.model.Shoe;
import com.nike_clone.backend_nike.repository.ShoeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

@Service
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

    @Override
    public Shoe updateShoeById(UUID shoeId, Shoe editiedShoe) {
        return shoeRepository.save(editiedShoe);
    }

    @Override
    public Boolean deleteShoeById(UUID shoeId) {

        if (shoeRepository.existsById(shoeId)) {
            Consumer<UUID> deleteShoeByID = x -> shoeRepository.deleteById(x);
            deleteShoeByID.accept(shoeId);
            return true;
        }
        return false;
    }


}
