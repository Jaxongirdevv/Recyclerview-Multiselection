package com.example.multiselection;

public class User {

    String username;
    int userimage;
    boolean selected=false;


    public User(String username, int userimage) {
        this.username = username;
        this.userimage = userimage;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getUserimage() {
        return userimage;
    }

    public void setUserimage(int userimage) {
        this.userimage = userimage;
    }
}
