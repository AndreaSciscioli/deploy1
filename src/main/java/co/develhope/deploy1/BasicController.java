package co.develhope.deploy1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class BasicController {
    @RequestMapping
    public String getDevName(){
        return "Jack Songs";
    }
}
