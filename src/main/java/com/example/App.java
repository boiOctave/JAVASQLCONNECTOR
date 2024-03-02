package com.example;

import java.util.*;

/**
 * PURPOSE OF APP
 * STORE NEW USERS
 * DISPLAY ALL USERS STORED
 * FILTER USER
 * EDIT STORED USER INFORMATION
 * 
 * NOT CRREATING API ENDPOINTS, JUST JDBC AND SQL
 *
 */
public class App {
    public static void main(String[] args) {

        // INSTANCE OF USER CREATED
        User user = new User();

        // ADD NEW USER
        System.out.println("Calling addnew user from main");
        user.addNewUser("Ayo", 170, "190");

        // ACCEPT USERS AND PRINT OUT
        List<User> users;

        users = user.returnAllUsers();
        for (User user2 : users) {
            System.out.println(user2);
        }

        

        user.findUserByHeight(170);

        user.findUserByName("Ayo");

        user.edit("Ayo");

    }
}
