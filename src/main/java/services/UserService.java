package services;

import model.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

public interface UserService {
    public void saveUser(User user) throws SQLException;
    public List<User> listUsers();
}
