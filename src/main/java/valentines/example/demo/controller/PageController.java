package valentines.example.demo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/promise")
    public String promise() {
        return "promise";
    }

    @GetMapping("/promise1")
    public String promise1() {
        return "promise1";
    }



    @GetMapping("/y")
    public String yes() {
        return "y";
    }

    @GetMapping("/n")
    public String no() {
        return "n";
    }
}
