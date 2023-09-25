package com.example.Car_Builder_store;


import com.example.Car_Builder_store.CarBuilder.Car;
import com.example.Car_Builder_store.CarBuilder.carBuilder;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.ArrayList;

@RestController
@CrossOrigin
@RequestMapping("/CarStore")
public class Controller {
    carBuilder car =new carBuilder();
    @PostMapping("/setCountry")
    public void setCountry(@RequestParam String country)
    {
        car.buildCountry(country);
    }
    @PostMapping("/setColor")
    public void setColor(@RequestParam String color)
    {
        car.buildColor(color);
    }
    @PostMapping("/setFactory")
    public void setFactory(@RequestParam String name)
    {
        car.buildFactory(name);
    }
    @PostMapping("/setPrice")
    public void setPrice(@RequestParam float price)
    {
        car.buildPrice(price);
    }
    @PostMapping("/setHeight")
    public void setHeight(@RequestParam float height)
    {
        car.buildHeight(height);
    }
    @PostMapping("/setWeight")
    public void setWeight(@RequestParam float weight)
    {
        car.buildWeight(weight);
    }
    @PostMapping("/setDistance")
    public void setDistance(@RequestParam float distance)
    {
        car.buildDistance(distance);
    }
    @PostMapping("/Build")
    public String Store() throws SQLException {
        return  car.storeCar();
    }
    @GetMapping("/AllCars")
    public ArrayList<Car> AllCar() throws SQLException {
      return car.returnCars();
    }

}
