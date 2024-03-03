package com.example;

import com.example.conn.dbConnect;

import java.sql.*;
import java.util.*;

public class db {

    Statement stmt = null;
    Connection conn = null;

    public db() {
        try {
            Class.forName(dbConnect.JDBC_DRIVER);
            // REGISTER DRIVER

            // CONNECT TO DATABASE
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

    /**
     * returnList() -> 👇🏾
     * 
     * RETURN A LIST OF ALL USERS AVAILABLE ON THE TABLE
     * 
     */

    public List<User> returnList() {
        List<User> list = new ArrayList<>();
        String query = "SELECT  height, name, iq, id from users";
        PreparedStatement st;
        try {
            st = conn.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                User u = new User();

                u.setHeight(rs.getInt(1));
                u.setName(rs.getString(2));
                u.setIq(rs.getString(3));
                u.setId(rs.getInt(4));
                list.add(u);

            }
        } catch (SQLException e) {

            throw new RuntimeException(e);
        }
        return list;

    }

    /**
     * filter() -> 👇🏾
     * 
     * FILTER BASED ON HEIGHT
     * 
     * used sql query to fetch all users
     * 
     * 
     */
    public List<User> filter(int height) {

        List<User> list = new ArrayList<>();
        String query = "SELECT  height, name, iq, id from users";
        try {
            PreparedStatement st = conn.prepareStatement(query);
            ResultSet rs = st.executeQuery();

            
            while (rs.next()) {
                User u = new User();

                u.setHeight(rs.getInt(1));
                u.setName(rs.getString(2));
                u.setIq(rs.getString(3));
                u.setId(rs.getInt(4));

                if (height == u.getHeight()) {

                    list.add(u);
                    
                }

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;

    }

    public User editUser(int id, String name) {
        User u = new User();
        try {
            // First Find the User and update
            String query1 = "UPDATE users SET name = ? WHERE id = ? ";
            PreparedStatement st = conn.prepareStatement(query1);
            st.setInt(2, id);
            st.setString(1, name);

            st.execute();
            // PRINT BACK UPDATED USER
            String query2 = "SELECT * FROM users WHERE id = ?";
            PreparedStatement st2 = conn.prepareStatement(query2);
            st2.setInt(1, id);
            ResultSet rs = st2.executeQuery();

            while (rs.next()) {
                u.setHeight(rs.getInt(1));
                u.setName(rs.getString(2));
                u.setIq(rs.getString(3));
                u.setId(rs.getInt(4));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return u;

    }

    public User findUser(String name) {

        User u = new User();
        String query = "SELECT * FROM users WHERE name = ?";

        try {

            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, name);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                u.setHeight(rs.getInt(1));
                u.setName(rs.getString(2));
                u.setIq(rs.getString(3));
                u.setId(rs.getInt(4));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return u;

    }

}
