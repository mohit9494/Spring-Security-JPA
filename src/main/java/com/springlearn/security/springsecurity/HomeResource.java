package com.springlearn.security.springsecurity;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class HomeResource {

    @GetMapping(value = "/")
    public String home() {
        return ("<h1>WelCome</h1>");
    }

    @GetMapping(value = "/user")
    public String user() {
        return ("<h1>WelCome User</h1>");
    }

    @GetMapping(value = "/admin")
    public String admin() {
        return ("<h1>WelCome Admin</h1>");
    }

}
