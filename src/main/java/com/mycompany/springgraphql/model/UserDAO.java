package com.mycompany.springgraphql.model;

import java.util.HashMap;
import java.util.Map;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class UserDAO {
    
    public static Map<String, User> users;
    
    static {
        
        BCryptPasswordEncoder enc = new BCryptPasswordEncoder();
        
        users = new HashMap<>();
        users.put("testname", new User("testname", enc.encode("testpass")) );
        users.put("admin", new User("admin", enc.encode("adminpass")) );
        users.put("user", new User("user", enc.encode("userpass")) );
        
    }
    
    public static User getUserByName(String name) {
        
        return users.get(name);
        
    }
    
}
