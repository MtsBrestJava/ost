package by.mts.brest.java.byport.controllers;

import by.mts.brest.java.byport.EmplRepository;
import by.mts.brest.java.byport.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class mainController {
    @Autowired
    private EmplRepository emplRepository;
    @GetMapping("/")
    public String pagehome (Model model){
        model.addAttribute("title", "Get List in DataBase");
        Iterable<Employee> employees = emplRepository.findAll();
        model.addAttribute("employes", employees);

    return "pagehome";
}

}
