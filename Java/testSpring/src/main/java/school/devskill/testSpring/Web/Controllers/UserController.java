package school.devskill.testSpring.Web.Controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import school.devskill.testSpring.Model.User;
import school.devskill.testSpring.Service.Classes.UserServiceImpl;
import school.devskill.testSpring.Web.Command.UserCommand;
import school.devskill.testSpring.Web.DTO.UserDTO;
import school.devskill.testSpring.Utility.HTTPUtilty;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    private final ObjectMapper mapper;
    private UserServiceImpl userServiceImpl;

    @Autowired
    public UserController(ObjectMapper mapper, UserServiceImpl userServiceImpl) {
        this.mapper = mapper;
        this.userServiceImpl = userServiceImpl;
    }

    @GetMapping(value = HTTPUtilty.GET_BY+"Name/{name}")
    public List<UserDTO> userGetByName(@PathVariable String name){
        List<User> list = userServiceImpl.getUsersByName(name);
        List<UserDTO> userDtoList = new ArrayList<>();
        for(int i = 0; i < list.size(); i++){
            userDtoList.add(mapper.convertValue(list.get(i),UserDTO.class));
        }
        return userDtoList;
    }

    @GetMapping(value = HTTPUtilty.GET_ALL)
    public List<UserDTO> userGetALl(){
        List<User> list = userServiceImpl.getAllUsers();
        List<UserDTO> userDtoList = new ArrayList<>();
        for(int i = 0; i < list.size(); i++){
            try{
                userDtoList.add(mapper.convertValue(list.get(i),UserDTO.class));
            } catch (IllegalArgumentException e){
                e.printStackTrace();
            }
        }
        return userDtoList;
    }

    @PostMapping(value = HTTPUtilty.CREATE)
    public String userCreate(@RequestBody UserCommand user){
        return userServiceImpl.addUser(user.getName(), user.getSurname(), user.getUsername(), user.getPassword());
    }

    @DeleteMapping(value = HTTPUtilty.DELETE_BY+"Id/{id}")
    public String userDelById(@PathVariable Integer id){
        return userServiceImpl.delById(id);
    }

    @DeleteMapping(value = HTTPUtilty.DELETE_ALL)
    public String userrDelAll(){
        return userServiceImpl.delAllUsers();
    }

}
