package com.firstProject.demo.Rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstAPI {
    @Value("${tester.name}")
    private String testerName;

    @Value("${framework.name}")
    private String frameworkName;

    @GetMapping("/testerInfo")
    public String getTesterInfo(){return testerName+", "+frameworkName;}


    @GetMapping("/")
    public String firstAPi(){
        return "Hello World";
    }
    @GetMapping("/second")
    public String secondAPi(){
        return "Hello World Again";
    }

    @GetMapping("/third")
    public String thirdAPi(){
        return "Fuck you world";
    }
}
