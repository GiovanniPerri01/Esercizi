package school.devskill.testSpring.Controllers;

import org.springframework.web.bind.annotation.*;
import school.devskill.testSpring.Utility.HTTPUtilty;

@RestController
@RequestMapping("comic")
public class Fumetti {

    @PostMapping(value = HTTPUtilty.CREATE)
    public void comicCreate(){}

    @DeleteMapping(value = HTTPUtilty.DELETE)
    public void comicDelete(@PathVariable Integer id){}

    @PutMapping(value = HTTPUtilty.UPDATE)
    public void comicUpdate(){}

    @GetMapping(value = HTTPUtilty.GET)
    public void comicGet(@PathVariable Integer id){}

    @PostMapping(value = HTTPUtilty.SEARCH)
    public void comicSearch(){}

}
