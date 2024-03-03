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

        user.addNewUser("Ayo", 170, "190");

        // ACCEPT USERS AND PRINT OUT
        List<User> users;

        /*
         * Loop through and print each user
         */
        users = user.returnAllUsers();
        System.out.println("All Users");
        for (User user2 : users) {
            System.out.println(user2);
        }

        // FILTER USERS by height AND PRINT OUT

        List<User> u = user.findUserByHeight(170);
        System.out.println("Filtered Users By Height");
    for (User user2 : u) {
        System.out.println(user2);
    }


        // FILTER USERS  by id AND PRINT OUT
        User u2 = user.findUserByName("here ololki");
        System.out.println("Filtered Users By Name");
        System.out.println(u2);

        // EDIT USER AND PRINT OUT
        User u3 = user.edit(1, "credit union");
        System.out.println("Edited User");
        System.out.println(u3);

    }
}
