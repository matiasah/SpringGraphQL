package com.mycompany.springgraphql.model;

public class User {
    
    public String name;
    public String password;
    
    public User() {
        this.name = null;
        this.password = null;
    }
    
    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getPassword() {
        return this.password;
    }
    
}
