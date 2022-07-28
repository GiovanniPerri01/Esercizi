package school.devskill.testSpring.Web.Controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import school.devskill.testSpring.Web.Command.LoginCommand;
import school.devskill.testSpring.Web.DTO.UserDTO;

@RestController
@RequestMapping("login")
public class LoginController {
    @PostMapping("/login")
    public UserDTO login(@RequestBody LoginCommand utente){
        UserDTO user = new UserDTO();
        user.setId(null);
        user.setName(null);
        user.setSurname(null);
        user.setUsername(utente.getEmail());
        return user;
    }
}
