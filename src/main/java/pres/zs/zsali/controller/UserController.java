package pres.zs.zsali.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    /**
     * 跳转到登录页面
     * @return
     */
    @RequestMapping("/login.html")
    public  String toLogin(){
        return "login";
    }

}
