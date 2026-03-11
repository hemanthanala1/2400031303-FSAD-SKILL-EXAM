package com.klef.fsad.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.klef.fsad.exam.model.Restaurant;
import com.klef.fsad.exam.service.RestaurantService;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController 
{
    @Autowired
    private RestaurantService service;

    @PostMapping("/add")
    public Restaurant addRestaurant(@RequestBody Restaurant r)
    {
        return service.addRestaurant(r);
    }

    @GetMapping("/viewall")
    public List<Restaurant> viewRestaurants()
    {
        return service.getRestaurants();
    }
}