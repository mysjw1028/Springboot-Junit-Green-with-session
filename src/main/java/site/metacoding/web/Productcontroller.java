package site.metacoding.web;

import org.springframework.web.bind.annotation.GetMapping;

public class Productcontroller {

    @GetMapping("/")
    public String home() {
        return "home";
    }
}
