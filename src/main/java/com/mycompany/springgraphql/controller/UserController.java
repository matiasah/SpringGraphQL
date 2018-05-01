package com.mycompany.springgraphql.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Secured("IS_AUTHENTICATED_FULLY")
public class UserController {
    
    @RequestMapping("user")
    public java.util.List index() {
        
        return java.util.Arrays.asList( com.mycompany.springgraphql.model.UserDAO.users.values().toArray() );
        
    }
    
    @RequestMapping("user2")
    public String index2() {
        return "test 3";
    }
    
}
