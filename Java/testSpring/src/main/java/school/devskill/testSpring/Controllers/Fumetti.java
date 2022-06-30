package school.devskill.testSpring.Controllers;

import org.springframework.web.bind.annotation.*;
import school.devskill.testSpring.Utility.HTTPUtilty;

@RestController
@RequestMapping("comic")
public class Fumetti {

    @PostMapping(value = HTTPUtilty.CREATE)
    public void comicCreate(){}

    @DeleteMapping(value = HTTPUtilty.DELETE)
    public void comicDelete(){}

    @PutMapping(value = HTTPUtilty.UPDATE)
    public void comicUpdate(){}

}
