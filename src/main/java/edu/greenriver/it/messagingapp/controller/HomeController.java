package edu.greenriver.it.messagingapp.controller;

//The framework imports for using the @ links.
import edu.greenriver.it.messagingapp.repositories.IMessagesRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    private IMessagesRepository repo;

    public HomeController(IMessagesRepository repo){
        this.repo = repo;
    }

    @RequestMapping("/")
    public String home(Model model){

        //Saves all messages
        model.addAttribute("messages", repo.findAll());

        //The job of this method is to return the name of the template.
        return "index";
    }
}
