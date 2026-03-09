package edu.market.auto.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import edu.market.auto.models.Car;
import edu.market.auto.models.CarRepository;

@Controller
public class AddAuthController {

   private final CarRepository carRepository;
   public AddAuthController(CarRepository repo) {
      carRepository = repo;
   }

    @GetMapping("/addauth")
   public String AddAuth(){
      return "addauth";
   }

   @GetMapping("/addphoto")
   public String AddPhoto(){
    return "addphoto";
   }

   @GetMapping("/adddesc")
   public String AddDesc(){
    return "adddesc";
   }

   @GetMapping("/addcont")
   public String AddCont(){
    return "addcont";
   }

   @PostMapping("/addphoto")
   public String AddNewCar(Car car) {
      carRepository.save(car);
      return "addphoto";
   }
    
}
