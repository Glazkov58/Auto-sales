package edu.market.auto.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import edu.market.auto.models.Car;
import edu.market.auto.models.CarRepository;


@Controller
public class CatalogController {

   private final CarRepository carRepo;

   @Autowired
   public CatalogController(CarRepository repo){
      carRepo = repo;
   }

   @GetMapping("/")
   public String showHomePage(Model model){
      List<Car> cars = carRepo.findAll();
      model.addAttribute("cars", cars);
    return "index";
   } 

   @GetMapping("/exampl")
   public String showExample(Model model) {
      model.addAttribute("message", "Привет, пользователь");
      List<String> models = new ArrayList<>();
      models.add("Mazda");
      models.add("BMW");
      models.add("Toyota");
      model.addAttribute("carModels", models);
      return "exampl";
   }
   
   @GetMapping("/catalog")
   public String Catalog(){
      return "catalog";
   }
}
