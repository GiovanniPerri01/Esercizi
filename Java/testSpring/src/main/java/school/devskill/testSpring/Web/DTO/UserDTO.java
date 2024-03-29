package school.devskill.testSpring.Web.DTO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private Integer id;
    private String name;
    private String surname;
    private String username;
    @JsonIgnore
    private String password;
}
