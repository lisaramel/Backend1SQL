package com.example.demo.controllers;

import com.example.demo.models.Friend;
import com.example.demo.repositories.FriendRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Lisa Ramel
 * Date: 2021-04-15
 * Time: 10:53
 * Project: Backend1SQL
 * Copywrite: MIT
 */
@Controller
@RequestMapping(path = "/friend")
public class FriendController {

    @Autowired
    private FriendRepository friendRepository;

    @GetMapping(path = "/add")
    public String addFriend(@RequestParam String firstName, @RequestParam String lastName, @RequestParam String number, @RequestParam String address){

        Friend f = new Friend();

        f.setFirstName(firstName);
        f.setLastname(lastName);
        f.setNumber(number);
        f.setAddress(address);

        friendRepository.save(f);

        return "Kompisen " + firstName + " " + lastName + " har skapats.";
    }

    @GetMapping(path="/all")
    public @ResponseBody
    Iterable<Friend> allFriends() {
        return friendRepository.findAll();
    }

    @GetMapping(path="/find")
    public @ResponseBody
    Iterable<Friend> findFriendByName(@RequestParam String firstName) {
        return friendRepository.findByFirstName(firstName);
    }

    @GetMapping(path="/update")
    public @ResponseBody
    Iterable<Friend> updateNumber(@RequestParam String firstName, @RequestParam String number) {
        for (Friend f :friendRepository.findByFirstName(firstName)){
            f.setNumber(number);
            friendRepository.save(f);
        }
        return friendRepository.findByFirstName(firstName);
    }

    @GetMapping(path="/remove")
    public @ResponseBody
    String removeFriend(@RequestParam String firstName) {
        for (Friend f :friendRepository.findByFirstName(firstName)){
            friendRepository.delete(f);
        }
        return firstName + " har tagits bort";
    }


}
