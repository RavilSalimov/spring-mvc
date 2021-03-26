package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarsServiceImp implements CarsService{
    List<Car> cars;
    {
        cars = new ArrayList<>();
        cars.add(new Car("BMW", "Red", "777"));
        cars.add(new Car("BMW", "Grey", "888"));
        cars.add(new Car("BMW", "Blue", "555"));
        cars.add(new Car("BMW", "Orange", "001"));
        cars.add(new Car("BMW", "White", "444"));
    }

    @Override
    public List<Car> getCars(){
        return cars;
    }
}
