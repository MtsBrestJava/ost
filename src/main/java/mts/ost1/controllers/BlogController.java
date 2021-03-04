package mts.ost1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogController {
    @GetMapping("/blog")
    public String blogMain(Model model){
        model.addAttribute("title","Блог нашего сайта");
        return "blog-main";
    }
    @GetMapping ("/")
    public String home(Model model) {
        model.addAttribute("title", "Главная страница нашего сайта");
        return "home";
    }
    @GetMapping ("/about")
    public String about(Model model) {
        model.addAttribute("title","Страница про то как мы учим Джаву");
        return "about";
    }
}
