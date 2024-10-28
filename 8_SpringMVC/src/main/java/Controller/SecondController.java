package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelExtensionsKt;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/second")
public class SecondController {


    @RequestMapping("/third")
     public ModelAndView third(){
         ModelAndView md = new ModelAndView();

         md.setViewName("third");
         md.addObject("name","Rjt");
         md.addObject("uid","21BCS2871");

         return md;
     }
}
