package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String home(Model model){
        model.addAttribute("id",123);
        return "index";
    }

    @RequestMapping("/about")
    public String about(){

        System.out.println("This is Home Controller Servlet");
        return "about";
    }

}
