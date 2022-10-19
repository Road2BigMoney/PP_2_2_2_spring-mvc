package web.controller;

import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import services.UserService;

import java.sql.SQLException;

@Controller

public class UsersController {

    private final UserService userService;

    @Autowired
    public UsersController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public String index(Model model) {
        model.addAttribute("users", "Тестовые юзерчики");
        return "index";
    }

    @GetMapping("/saveUser")
    public String saveUser(Model model) throws SQLException {
        User user = new User();
        model.addAttribute("user", user);
        return "user-info";
    }
}
