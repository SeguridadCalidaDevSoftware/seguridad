package cl.kemolinaj.seguridad.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String home(@RequestParam(name = "name", defaultValue = "Seguridad y Calidad de Software") String name, Model model) {
        model.addAttribute("name", name);
        return "home";
    }

    @GetMapping("/")
    public String index(@RequestParam(name = "name", defaultValue = "Seguridad y Calidad de Software") String name, Model model) {
        model.addAttribute("name", name);
        return "home";
    }
}
