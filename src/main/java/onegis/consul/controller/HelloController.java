package onegis.consul.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: tunan
 * @version: v.1.0.1
 * @date: created on 16:37 2019-02-15
 */
@RestController
public class HelloController {

    @Value("${name}")
    private String name;

//    @Value("${from}")
//    private String from;

    @GetMapping("/name")
    public String hello(){
        return name;
    }

    @GetMapping("/hello")
    public String getFrom(){
        return "hello consul";
    }

}
