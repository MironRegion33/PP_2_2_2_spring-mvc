package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.servis.CarServis;

@Controller
public class CarController {

    private CarServis carServis;

    @Autowired
    public CarController(CarServis carServis) {
        this.carServis = carServis;
    }

    @RequestMapping("/cars")
    public String listCars(@RequestParam(value = "count", required = false) Integer count, Model model) {
        if (count != null) {
            model.addAttribute("cars", carServis.getCar(count));
        } else {
            model.addAttribute("cars", carServis.getList());
        }
        return "cars";
    }
}
