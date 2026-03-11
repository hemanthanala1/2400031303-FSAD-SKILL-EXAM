package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import model.Restaurant;
import service.RestaurantService;

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