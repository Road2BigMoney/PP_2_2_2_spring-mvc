package web.controller;

import model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import services.CarService;
import services.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    private CarService carService = new CarServiceImpl();

    @GetMapping("/cars")
    public String printCars(@RequestParam(required = false) Integer count, ModelMap model) {
        if (count != null) {
            model.addAttribute("content", carService.getListByNumbersOfCars(count));
        } else {
            model.addAttribute("content", carService.getAllCars());
        }



        return "cars";
    }
}
