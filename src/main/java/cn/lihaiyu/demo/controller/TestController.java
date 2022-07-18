package cn.lihaiyu.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  //@RestController= @@Controller + @ResponseBody
public class TestController {
    
    @RequestMapping("/helloword")
    public String helloword(){
        return "helloword";
    }
}