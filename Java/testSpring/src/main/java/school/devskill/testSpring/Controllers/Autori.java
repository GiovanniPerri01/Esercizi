package school.devskill.testSpring.Controllers;

import org.springframework.web.bind.annotation.*;
import school.devskill.testSpring.Utility.HTTPUtilty;

@RestController
@RequestMapping("author")
public class Autori {

    @PostMapping(value = HTTPUtilty.CREATE)
    public void authorCreate(){}

    @DeleteMapping(value = HTTPUtilty.DELETE)
    public void authorDelete(@PathVariable Integer id){}

    @PutMapping(value = HTTPUtilty.UPDATE)
    public void authorUpdate(){}

    @GetMapping(value = HTTPUtilty.GET)
    public void authorGet(@PathVariable Integer id){}

    @PostMapping(value = HTTPUtilty.SEARCH)
    public void authorSearch(){}

}
