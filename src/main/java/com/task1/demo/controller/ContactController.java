package com.task1.demo.controller;

import com.task1.demo.entity.Contact;
import com.task1.demo.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ContactController {
@Autowired
    private ContactRepository repo;

        @PostMapping("/contact")

        public String handleContact(
                @RequestParam String name,
                @RequestParam String email,
                @RequestParam String message) {

            Contact contact = new Contact();

            contact.setName(name);
            contact.setEmail(email);
            contact.setMessage(message);

            repo.save(contact);

            return "Form submitted successfully";
        }
//        public String handleContact(@RequestParam String name,
//                                    @RequestParam String email,
//                                    @RequestParam String message) {
//            System.out.println("New Contact Form Submission");
//            System.out.println("Name: " + name);
//            System.out.println("Email: " + email);
//            System.out.println("Message: " + message);
//
//            return "Form submitted successfull";
//
//        }


    @PostMapping("/submit")
    public Contact saveContact(@RequestBody Contact contact)
    {
        return repo.save(contact);
    }

    @GetMapping("/contacts")
    public List<Contact> getALlContact()
    {
        return repo.findAll();
    }
    }
