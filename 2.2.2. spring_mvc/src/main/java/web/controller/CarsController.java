package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarsServiceImp;

import java.util.List;

@Controller
//@RequestMapping("/cars")
public class CarsController {

    CarsServiceImp carsServiceImp;

    @Autowired
    public CarsController(CarsServiceImp carsServiceImp) {
        this.carsServiceImp = carsServiceImp;
    }
    @GetMapping("/cars")
    public String printCars(@RequestParam(name = "count", required=false) Integer n, Model model) {
        List<Car> cars =  carsServiceImp.getCars();
        if(n == null || 5 <= n){
            model.addAttribute("cars", cars);}
        else{
            model.addAttribute("cars", cars.subList(0, n));}
        return "cars";
    }
}
