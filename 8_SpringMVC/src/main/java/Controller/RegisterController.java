package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.net.http.HttpRequest;

@Controller
public class RegisterController {

    @RequestMapping("/contact")
    public String contact(){
        System.out.println("This is the Contact Controller");
        return "contact";
    }
}
