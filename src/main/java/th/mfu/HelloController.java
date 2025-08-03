package th.mfu;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    String hello() {
        return "Hello World!";
    }
    String hiName(String name){
        return "Hi " + name + "!";
    }
   
}
