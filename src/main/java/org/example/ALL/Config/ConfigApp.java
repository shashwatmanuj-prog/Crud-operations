package org.example.ALL.Config;

import org.example.ALL.Database.DatabaseConnection;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.example")
public class ConfigApp {
    @Bean(initMethod = "init",destroyMethod = "cleanup")
    public DatabaseConnection dbConnection(){
        return new DatabaseConnection();
    }

}
