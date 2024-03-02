package com.example;

import com.example.conn.dbConnect;
import java.sql.*;
// import java.util.*;

public class db {

    Statement stmt = null;
    Connection conn = null;

    public db() {
        try {
            Class.forName(dbConnect.JDBC_DRIVER);
            // REGISTER DRIVER

            // CONNECT TO DATABASE
            System.out.println("Connecting to the database...");
            conn = DriverManager.getConnection(dbConnect.DB_URL, dbConnect.USER, dbConnect.PASS);

        } catch (ClassNotFoundException e) {

            e.printStackTrace();
        } catch (SQLException e) {

            e.printStackTrace();
        }

    }

    /**
     * saveNewEntry() -> 👇🏾
     * 
     * USE PREPARED STATEMENT TO STORE NEW USER
     * 
     */

    public void saveNewEntry(User newEntry) {

        String query = "INSERT INTO users (height, name, iq, id) VALUES (?,?,?,?)";

        try {
            PreparedStatement st = conn.prepareStatement(query);
            st.setInt(1, newEntry.getHeight());
            st.setString(2, newEntry.getName());
            st.setString(3, newEntry.getIq());
            st.setString(4, null);
            st.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
