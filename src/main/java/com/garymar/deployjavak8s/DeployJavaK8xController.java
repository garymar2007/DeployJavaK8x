package com.garymar.deployjavak8s;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

public class DeployJavaK8xController {

    @RequestMapping("/")
    public String helloWorld(){
        return "Hello from Spring Boot";
    }

    @GetMapping("/home")
    public String myHome() {
        return "Welcome to Gary Mar's World";
    }

    @GetMapping("/student")
    public StudentInfo getStudent() {
        return new StudentInfo(1, "Gary", "Ma");
    }
}
