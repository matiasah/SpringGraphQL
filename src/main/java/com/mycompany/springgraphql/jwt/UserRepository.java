package com.mycompany.springgraphql.jwt;

import com.mycompany.springgraphql.model.User;
import com.mycompany.springgraphql.model.UserDAO;

public class UserRepository {
    
    public User findByUsername(String username) {
        
        return UserDAO.getUserByName(username);
        
    }
    
}