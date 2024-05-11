package com.nike_clone.backend_nike.controller;

import com.nike_clone.backend_nike.model.Shoe;
import com.nike_clone.backend_nike.service.ShoeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/v1/api")
public class ShoeController {

    @Autowired
    private ShoeService service;

    @PostMapping("/add-shoe")
    public Shoe AddShoe(@RequestBody Shoe shoe) {
        return service.addSingleShoe(shoe);
    }
}
