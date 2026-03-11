package com.klef.fsad.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.fsad.exam.model.Restaurant;
import com.klef.fsad.exam.repository.RestaurantRepository;

@Service
public class RestaurantService 
{
    @Autowired
    private RestaurantRepository repo;

    public Restaurant addRestaurant(Restaurant r)
    {
        return repo.save(r);
    }

    public List<Restaurant> getRestaurants()
    {
        return repo.findAll();
    }
}