package com.example;

import java.util.*;
import java.sql.*;

public class UserLogic {
    Connection conn = null;
    db db1 = new db();

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
     * @code
     * 
     */

    public List<User> returnAllUsers() {
       
        List<User> list = db1.returnList();
        return list;
    }

    /**
     * findUserByHeight() -> 👇🏾
     * TAKE IN HEIGHT
     * SEARCH FOR RHTYMING HEIGHT(USING SQL QUERIES)
     * RETURN RESULT
     * @return 
     */

    public List<User> findUserByHeight(int i) {
        int height = i;
        List<User> u = db1.filter(height);
        return u;

    }

    /**
     * findUserByName() -> 👇🏾
     * TAKE IN NAME
     * SEARCH FOR RHTYMING HEIGHT(USING SQL QUERIES)
     * RETURN RESULT
     * @return 
     */

    public User findUserByName(String name) {
        User u = db1.findUser(name);
        return u;
    }

    /**
     * 
     * edit() -> 👇🏾
     * TAKE IN INFO
     * FIND USER USING ID, CHECK AVAIILABLE FIELDS AND EDIT ONE THAT IS PRESENT
     * RETURN RESULT
     */

    public User edit(int id,String newName) {
        User u = db1.editUser(id,newName);
        return u;

    }
}
