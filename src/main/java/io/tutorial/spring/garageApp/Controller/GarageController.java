package io.tutorial.spring.garageApp.Controller;

import io.tutorial.spring.garageApp.model.Car;
import io.tutorial.spring.garageApp.service.GarageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GarageController {

    @Autowired
    private GarageService garageService;

    @RequestMapping(method =RequestMethod.GET, value ="/cars")
    public List<Car> getCars(){return garageService.getCars();}

    @RequestMapping("/car/{id}")
    public Car getCar(@PathVariable long id){return garageService.getCar(id);}

    @RequestMapping(method = RequestMethod.DELETE, value = "/car/{id}")
    public void deleteCar(@PathVariable long id) {garageService.deleteCar(id);}

    @RequestMapping(method = RequestMethod.POST, value ="/cars/add")
    public Car addCar(@RequestBody Car car){ return garageService.addCar(car);}

    @RequestMapping(method = RequestMethod.PUT, value = "/car/{id}")
    public void updateCar(@RequestBody  Car car, @PathVariable long id){
        garageService.updateCar(car, id);
    }
}
