package com.task1.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {



        @PostMapping("/contact")
        public String handleContact(@RequestParam String name,
                                    @RequestParam String email,
                                    @RequestParam String message) {
            System.out.println("New Contact Form Submission");
            System.out.println("Name: " + name);
            System.out.println("Email: " + email);
            System.out.println("Message: " + message);

            return "Form submitted successfull";
        }
    }
