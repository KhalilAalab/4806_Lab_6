package com.example.demo_new;

import javax.persistence.*;
import javax.swing.*;
import java.util.List;

/*
Author: Khalil Aalab
Student ID: 101070879
Date: February 18, 2022
Class: SYSC 4806
Lab 5
 */

@Entity
public class AddressBook {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @OneToMany(cascade = CascadeType.ALL)
    protected List<BuddyInfo> buddyList;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AddressBook(){

    }

    public void addBuddy(BuddyInfo buddy) {
        buddyList.add(buddy);
    }

    public void removeBuddy(int buddyIndex) {
        buddyList.remove(buddyIndex);
    }

    public BuddyInfo getBuddy(int index) {
        return buddyList.get(index);
    }

    public List<BuddyInfo> getBuddyList() {
        return buddyList;
    }

    public void setBuddyList(List<BuddyInfo> buddyList) {
        this.buddyList = buddyList;
    }

    @Override
    public String toString() {
        String toReturn = "";
        for (int i = 0; i < buddyList.size(); i++){
            toReturn += buddyList.get(i).toString() + '\n';
        }
        return toReturn;
    }


}
