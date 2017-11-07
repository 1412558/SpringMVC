package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String printWelcome(Model model) {

        model.addAttribute("message", "This is a spring mvc tutorial, 1412558- YumaKuga");
        return "welcome";

    }
}
