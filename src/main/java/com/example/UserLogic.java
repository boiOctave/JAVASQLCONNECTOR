package com.example;

import java.sql.*;

public class UserLogic {
    Connection conn = null;

    /**
     * USER METHODS AND FUNCTIONS
     */

    /**
     * addNewUser() -> 👇🏾
     * TAKE IN USER INFO
     * STORE INPUT INTO A NEW USER
     * CALL METHOD TO SAVE AND PASSES A NEW USER
     */

    // LETS GOOOOOOOO!!!!!!!!!!!!!!

    public void addNewUser(String name, int height, String iq) {

        System.out.println("Calling addnew user from usere logic");

        db db1 = new db();
        User newEntry = new User();

        newEntry.setName(name);
        newEntry.setHeight(height);
        newEntry.setIq(iq);

        db1.saveNewEntry(newEntry);

    }

    /**
     * returnAllUsers() -> 👇🏾
     * 
     * CALL ALL INFO FROM TABLE
     * RETURN A LIST OF USERS
     * 
     */

    public void returnAllUsers() {

    }

    /**
     * findUserByHeight() -> 👇🏾
     * TAKE IN HEIGHT
     * SEARCH FOR RHTYMING HEIGHT(USING SQL QUERIES)
     * RETURN RESULT
     */

    public void findUserByHeight(int i) {

    }

    /**
     * findUserByName() -> 👇🏾
     * TAKE IN NAME
     * SEARCH FOR RHTYMING HEIGHT(USING SQL QUERIES)
     * RETURN RESULT
     */

    public void findUserByName(String string) {

    }

    /**
     * 
     * edit() -> 👇🏾
     * TAKE IN INFOS
     * FIND USER USING ID, CHECK AVAIILABLE FIELDS AND EDIT ONE THAT IS PRESENT
     * RETURN RESULT
     */

    public void edit(String string) {

    }
}
