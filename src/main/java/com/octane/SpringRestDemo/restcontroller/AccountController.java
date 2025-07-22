package com.octane.SpringRestDemo.restcontroller;

import org.springframework.web.bind.annotation.RestController;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class AccountController {
    
    @GetMapping("/")
    public String hi(){
        return "Hello from AccountController";
    }

    @GetMapping("/test")
    @Tag(name = "Test"  , description = "The Test API")
    @SecurityRequirement(name = "bearerAuth")
    public String test() {
        return "Test endpoint accessed successfully!";
    }
}
