package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String home(Model model){
        model.addAttribute("id",123);
        return "index";
    }

    @RequestMapping(path="/about",method= RequestMethod.POST)
    public String about(){

        System.out.println("This is Home Controller Servlet");
        return "about";
    }

    @RequestMapping("/help")
    public ModelAndView help(){

        ModelAndView md = new ModelAndView();
        md.addObject("name","Rjt");
        md.setViewName("help");
        LocalDate date = LocalDate.now();
        md.addObject("date",date);

        return md;
    }



}
