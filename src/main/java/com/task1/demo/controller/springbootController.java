package com.task1.demo.controller;

import com.task1.demo.entity.Contact;
import com.task1.demo.repository.ContactRepository;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class springbootController {
    public ContactRepository repo;

    @GetMapping("/contacts")

    public List<Contact> getAllContacts()
    {
        return repo.findAll();
    }

}
