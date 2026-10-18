package org.example.ALL.Repository;

import org.example.ALL.Database.DatabaseConnection;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class Userrepo {
    private DatabaseConnection db;

    public Userrepo(DatabaseConnection db) {
        this.db = db;
    }
    public List<String> findall(){
        return db.getuser();
    }

    public void save(String name) {
    }
}
