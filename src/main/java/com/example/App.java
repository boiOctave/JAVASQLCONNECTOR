package com.example;

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


        user.returnAllUsers();

        user.findUserByHeight(170);

        user.findUserByName("Ayo");

        user.edit("Ayo");

        user.addNewUser("Ayo", 170, "Brilliant");

    }
}
