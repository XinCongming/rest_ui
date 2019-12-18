package com.xin.controller;

/**
 * @Author Lucas
 * @Date 2019/12/13 17:44
 * @Version 1.0
 */
public class User {
    private Integer id;
    private String username;
    private String password;

    public User() {
    }

    public User(Integer id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean matchUsernameAndPassword(String username, String password) {
        if(this.username.equals(username) && this.password.equals(password)) {
            return true;
        }else {
            return false;
        }
    }
}
