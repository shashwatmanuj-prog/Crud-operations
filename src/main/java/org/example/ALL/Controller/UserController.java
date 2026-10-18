package org.example.ALL.Controller;

import org.example.ALL.Service.UserService;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class UserController {
    private UserService userservice;

    public UserController(UserService userservice) {
        this.userservice = userservice;
    }

    public void createuser(String name){
        userservice.add(name);
        System.out.println("User addedd" + name);



    }
    public void alluser(){

        List<String> users=userservice.getAllUsers();
        System.out.println("All users " + users);
    }

    public void listUsers() {
    }
}
