package com.example.demo_new;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

@RestController
public class Controller {

    @Autowired
    private AddressBookRepository addressBookRepository;

    @PostMapping("/NewAddressBook")
    public String newAddressBook() {
        AddressBook addressBook = new AddressBook();
        addressBookRepository.save(addressBook);
        return "New AddressBook Started with id " + addressBook.getId();
    }

    @PostMapping("/AddBuddyInfo")
    public String addBuddy(@RequestParam long addressBookID, @RequestParam String buddyInfoName, @RequestParam String buddyInfoPhoneNumber) {
        BuddyInfo newBuddy = new BuddyInfo(buddyInfoPhoneNumber, buddyInfoName);
        AddressBook myAddressBook = addressBookRepository.findById(addressBookID);
        myAddressBook.addBuddy(newBuddy);
        addressBookRepository.save(myAddressBook);
        return "added Buddy " + newBuddy.getName() + " with id + " + newBuddy.getId()
                + " from AddressBook with id " + addressBookID +
                " total size " + addressBookRepository.count();
    }

    @DeleteMapping("/DeleteBuddyInfo")
    public String removeBuddy(@RequestParam long addressBookID, @RequestParam int index) {
        AddressBook myAddressBook = addressBookRepository.findById(addressBookID);
        myAddressBook.removeBuddy(index);
        addressBookRepository.save(myAddressBook);
        return "removing Buddy with ID " + index + " from AddressBook "
                + addressBookID;
    }

}
