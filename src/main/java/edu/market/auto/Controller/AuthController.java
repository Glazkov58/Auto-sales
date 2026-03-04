package edu.market.auto.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthController {

    @GetMapping("/reg")
    public String Reg() {
        return "reg";
    }
    
    @GetMapping("/auth")
    public String Auth() {
        return "auth";
    }
    
}
