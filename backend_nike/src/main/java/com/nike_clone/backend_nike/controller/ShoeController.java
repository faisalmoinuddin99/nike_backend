package com.nike_clone.backend_nike.controller;

import com.nike_clone.backend_nike.model.Shoe;
import com.nike_clone.backend_nike.service.ShoeService;
import com.nike_clone.backend_nike.service.ShoeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/api")
public class ShoeController {

    @Autowired
    private ShoeServiceImpl service;

    @PostMapping("/add-shoe")
    public Shoe addShoe(@RequestBody Shoe shoe) {
        return service.addSingleShoe(shoe);
    }

    @GetMapping
    public List<Shoe> getShoeList() {
        return service.getAllShoes();
    }

}
