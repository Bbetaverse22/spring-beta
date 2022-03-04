package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/car")
public class CarController {

    @RequestMapping("/info") //localhost:8080/car/info?make=Honda
    public String carInfo(@RequestParam String make, @RequestParam Integer year, Model model){

       model.addAttribute("make", make);
       model.addAttribute("year", year);
        return "car/car-info";
    }
    @RequestMapping("/info2") //localhost:8080/car/info?make=Honda
    public String carInfo2(@RequestParam(value = "make",required = false) String make, Model model){

        model.addAttribute("make", make);
        return "car/car-info";
    }
    @GetMapping(value="/info3") //localhost:8080/car/info3?make=Honda
    public String carInfo3(@RequestParam String make, Model model){

        model.addAttribute("make", make);
        return "car/car-info";
    }

    @RequestMapping("/info/{make}/{year}") //localhost:8080/car/info/honda/2015
    public String getCarInfo(@PathVariable String make,  @PathVariable Integer year,Model model) {
        model.addAttribute("make", make);
        model.addAttribute("year", year);
        return "car/car-info";
    }
}
