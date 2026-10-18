package org.example.ALL;

import org.example.ALL.Config.ConfigApp;
import org.example.ALL.Controller.UserController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(ConfigApp.class);
        UserController controller=context.getBean(UserController.class);
        controller.createuser("Shaswat");
        controller.createuser("Manuj");
        controller.listUsers();
    }
}
