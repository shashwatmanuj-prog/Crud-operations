package org.example.ALL.Service;

import org.example.ALL.Repository.Userrepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
private Userrepo userrepository;

    public UserService(Userrepo userrepository) {
        this.userrepository = userrepository;
    }

    public void add(String name) {
        userrepository.save(name);

    }

    public List<String> getAllUsers() {
        userrepository.findall();
        return null;
    }
}
