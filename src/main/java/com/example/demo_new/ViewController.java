package com.example.demo_new;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;
import java.util.LinkedList;

@Controller
public class ViewController {

    @Autowired
    private AddressBookRepository addressBookRepository;

    @GetMapping("/viewAllAddressBooks")
    public String viewAllAddressBooks(Model model){
        LinkedList<AddressBook> AddressBooks = new LinkedList<>((Collection<? extends AddressBook>) addressBookRepository.findAll());
        model.addAttribute("AddressBooks", AddressBooks);
        return "viewAllAddressBooks";
    }

    @GetMapping("/")
    public String links(Model model){
        return "links";
    }

    @GetMapping("/addBuddyInfoView")
    public String addBuddyView(Model model){
        return "addBuddyInfoView";
    }

    @GetMapping("/addAddressBookView")
    public String addAddressBookView(Model model){
        return "addAddressBookView";
    }

    @GetMapping("/deleteBuddyInfoView")
    public String deleteBuddyInfoView(Model model){
        return "deleteBuddyInfoView";
    }

}
