package org.example.ALL.Database;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


public class DatabaseConnection {
    private List<String> users;
    public void init(){
users=new ArrayList<>();
        System.out.println("Database connected (simulated)");



    }
    public List<String> getuser(){

return users;

    }
public void adduser(String user){
        users.add(user);

}
public void cleanup(){
    System.out.println("Database is disconnected");
}



}
