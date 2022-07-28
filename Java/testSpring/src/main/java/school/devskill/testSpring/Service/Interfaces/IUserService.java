package school.devskill.testSpring.Service.Interfaces;

import school.devskill.testSpring.Model.Author;
import school.devskill.testSpring.Model.Category;
import school.devskill.testSpring.Model.User;

import java.util.List;

public interface IUserService {
    String addUser(String name, String surname, String username, String password);
    String delById(Integer id);
    String delAllUsers();
    List<User> getAllUsers();
    List<User> getUsersByName(String name);
}
