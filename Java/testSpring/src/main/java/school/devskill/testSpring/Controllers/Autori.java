package school.devskill.testSpring.Controllers;

import org.springframework.web.bind.annotation.*;
import school.devskill.testSpring.Utility.HTTPUtilty;

@RestController
@RequestMapping("author")
public class Autori {

    @PostMapping(value = HTTPUtilty.CREATE)
    public void authorCreate(){}

    @DeleteMapping(value = HTTPUtilty.DELETE)
    public void authorDelete(){}

    @PutMapping(value = HTTPUtilty.UPDATE)
    public void authorUpdate(){}

}
