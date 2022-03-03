package com.cydeo.controler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

    @RequestMapping("/welcome")
    public String homepage(Model model){
        model.addAttribute("name", "cydeo");
        model.addAttribute("course", "MVC");
        return "/student/welcome";
    }
}
