package pres.zs.zsali.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {
    @RequestMapping("/index.html")
    public String index(){
        return "123455";
    }
}
