package com.globamatics.bike.controllers;

import com.globamatics.bike.models.Bike;
import com.globamatics.bike.repositores.BikeRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/bikes")
public class BikesController {

    @Autowired
    private BikeRep bikeRep;

    @GetMapping
    public Iterable<Bike> bikeList(){
        return bikeRep.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void create(@RequestBody Bike bike){
        bikeRep.save(bike);
    }

    @GetMapping("/{id}")
    public Bike get(@PathVariable("id") long id){
        return bikeRep.findById(id).get();
    }

}
