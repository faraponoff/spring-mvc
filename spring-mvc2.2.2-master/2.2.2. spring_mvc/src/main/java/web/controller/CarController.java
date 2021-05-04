package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarsServiceImpl;

@Controller
@RequestMapping("/cars")
public class CarController {

    @GetMapping
    public String showCars(@RequestParam(value = "count", required = false) Integer count, Model model) {
        CarsServiceImpl service = new CarsServiceImpl();
        model.addAttribute("cars",service.getCarsByCount(count));
        return "cars";
    }
}
