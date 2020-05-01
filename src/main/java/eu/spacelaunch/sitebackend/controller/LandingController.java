package eu.spacelaunch.sitebackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * LandingController
 */
@RestController
@RequestMapping("/")
public class LandingController {

    @GetMapping
    public String landing(){
        return "Welcome to the landing page!";
    }

    
}