package com.example.maintenancemonitor1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/")
    public String hello(){
        return "Funktioniert";
    }
    
    @RequestMapping("/Mo")
    public String mo(){
        return "Mo hat sein Passwort vergessen!";
    }
}
