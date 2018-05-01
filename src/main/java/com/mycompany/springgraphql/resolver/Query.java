package com.mycompany.springgraphql.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.mycompany.springgraphql.model.User;
import com.mycompany.springgraphql.model.UserDAO;
import java.util.ArrayList;
import org.springframework.stereotype.Component;

@Component
public class Query implements GraphQLQueryResolver {
    
    public ArrayList<User> getUsers() {
        
        ArrayList<User> users = new ArrayList<>();
        users.addAll( UserDAO.users.values() );
        
        return users;
        
    }
    
}
