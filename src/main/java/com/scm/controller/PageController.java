package com.scm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PageController {

    @RequestMapping("/home")
    public String home(Model model) {
        System.out.println("Home Page Handler");
        model.addAttribute("name", "Pintu Mahato");
        model.addAttribute("YoutubeChannel", "Style World");
        model.addAttribute("gitHub", "https://github.com/PintuM07");
        return "home";
    }

    // about route

    @RequestMapping("/about")
    public String aboutPage(Model model) {
        model.addAttribute("isLogin", true);
        System.out.println("about page loading");
        return "about";
    }

    // services
    @RequestMapping("/services")
    public String servicesPage() {
        System.out.println("services page loading");
        return "services";
    }

    // contact
    @GetMapping("/contact")
    public String contactPage() {
        System.out.println();
        return new String("contact");
    }

    // services
    @GetMapping("/login")
    public String loginPage() {
        System.out.println();
        return new String("login");
    }

    // services
    @GetMapping("/register")
    public String registerPage() {
        System.out.println();
        return new String("register");
    }
}
