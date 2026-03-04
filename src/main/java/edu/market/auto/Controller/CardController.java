package edu.market.auto.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CardController {

    @GetMapping("/card")
        public String Card() {
            return "card";
        }

        
    }
 

