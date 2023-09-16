package com.smkconsulting.fleetmsv2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {
    @GetMapping("/index")
    public String home(){ return "index"; }
    
    @GetMapping("/index2")
    public String widget(){
        return "index2";
    }

    @GetMapping("/hr")
    public String hr(){
        return "/hr/index";
    }
}
