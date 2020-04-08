package com.example.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/")
@Controller
public class testController {
    @RequestMapping("test")
    public String testApi(){
        return "/index.jsp";
    }


}
