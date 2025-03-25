package com.sagar.SpringBootWebProject;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String home(){
        System.out.println("Home method called");
        return "index.jsp";
    }

    @RequestMapping("/add")
    public String add(@RequestParam("num1") int num, @RequestParam("num2") int num3, Model model){
        System.out.println("In add");
        int result = num + num3;
        //System.out.println("Addition is : " + result);

        model.addAttribute("result", result);
        return "result.jsp";
    }
}
