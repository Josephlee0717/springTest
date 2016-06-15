package joe.levante.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MianController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(){
        System.out.print("this is a test!");
        return "index";
    }
}
