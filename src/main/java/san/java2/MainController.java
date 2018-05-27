package san.java2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


public class MainController {
    @RequestMapping("/")
    public String hello(){
        return "index.html";
    }

}




