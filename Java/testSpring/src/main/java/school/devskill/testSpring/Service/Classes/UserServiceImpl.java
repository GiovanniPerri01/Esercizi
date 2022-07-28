package school.devskill.testSpring.Service.Classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import school.devskill.testSpring.Model.Author;
import school.devskill.testSpring.Model.User;
import school.devskill.testSpring.Persistence.Repository.IAuthorRepository;
import school.devskill.testSpring.Persistence.Repository.IUserRepository;
import school.devskill.testSpring.Service.Interfaces.IUserService;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    private final IUserRepository userRepository;

    @Autowired
    public UserServiceImpl(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public String addUser(String name, String surname, String username, String password){
        userRepository.addUser(name, surname, username, password);
        return "User saved";
    }

    @Override
    public String delById(Integer id){
        if(id!=null){
            userRepository.delById(id);
            return "User deleted";
        }
        else return "Couldn't delete user, it does not exist";
    }

    @Override
    public String delAllUsers(){
        userRepository.delAllUsers();
        return "All users deleted";
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.getAllUsers();
    }

    @Override
    public List<User> getUsersByName(String name) {
        return userRepository.getUsersByName(name);
    }
}
