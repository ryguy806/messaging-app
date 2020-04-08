package edu.greenriver.it.messagingapp.controller;

//The framework imports for using the @ links.
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping
    public String home(){

        //The job of this method is to return the name of the template.
        return "index";
    }
}
