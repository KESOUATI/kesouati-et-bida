package com.club.sport.controllers;

import com.club.sport.models.Contact;
import com.club.sport.models.Reservation;
import com.club.sport.repositories.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;


@Controller


public class ContactController {
    @Autowired
    ContactRepository contactRepository;


    @RequestMapping("/Contact")
    public String Contact(){
        return "Contact";}

    @RequestMapping("/index")
    public String index(){
        return "index";}

    @RequestMapping("/save1")
    public String Save(
            @ModelAttribute("contact") Contact contact , ModelMap model
    )throws ParseException
    {
        Contact memo=contactRepository.save(contact);
        return "Contact";

    }

    @RequestMapping("/Listcontact")
    public String List(ModelMap model) {
        List<Contact> CONTACT=contactRepository.findAll();
        model.addAttribute("contacts",CONTACT);
        return "listcontact";
    }

    @RequestMapping("/delete1")
    public String Delete(@RequestParam("id") Long id, ModelMap model) {
        contactRepository.deleteById(id);
        List<Contact> contact=contactRepository.findAll();
        model.addAttribute("contacts",contact);
        return "listcontact";
    }

}
