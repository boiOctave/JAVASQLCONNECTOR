package com.example;

public class User extends UserLogic {

    int id;
    int height;
    String name;
    String iq;

    /**
     * 
     * GETTERS AND SETTERS
     */

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIq() {
        return iq;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", height=" + height + ", name=" + name + ", iq=" + iq + "]";
    }

    public void setIq(String iq) {
        this.iq = iq;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

  

}
