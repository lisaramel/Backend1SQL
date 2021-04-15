package com.example.demo.repositories;

import com.example.demo.models.Friend;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Lisa Ramel
 * Date: 2021-04-15
 * Time: 10:31
 * Project: Backend1SQL
 * Copywrite: MIT
 */
@Repository
public interface FriendRepository extends CrudRepository<Friend, Long> {

    List<Friend> findByFirstName(String firstName);
    //List<Friend> findByFirstAndLastName(String firstName, String LastName);
    List<Friend> findByNumber(String number);
    List<Friend> findByAddress(String address);

}
