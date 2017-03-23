package org.springframework.samples.petclinic.system;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("WelcomeController")
class WelcomeController {

    @RequestMapping("/")
    public String welcome() {
        return "welcome";
    }
}
