package school.devskill.testSpring.Controllers;

import org.springframework.web.bind.annotation.*;
import school.devskill.testSpring.Utility.HTTPUtilty;

@RestController
@RequestMapping("user")
public class Utenti {

    @PostMapping(value = HTTPUtilty.CREATE)
    public void userCreate(){}

    @DeleteMapping(value = HTTPUtilty.DELETE)
    public void userDelete(@PathVariable Integer id){
    }

    @PutMapping(value = HTTPUtilty.UPDATE)
    public void userUpdate(){}

    @GetMapping(value = HTTPUtilty.GET)
    public void userGet(@PathVariable Integer id){}

    @PostMapping(value = HTTPUtilty.SEARCH)
    public void userSearch(){}

}
