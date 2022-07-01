package school.devskill.testSpring.Controllers;

import org.springframework.web.bind.annotation.*;
import school.devskill.testSpring.Utility.HTTPUtilty;

@RestController
@RequestMapping("category")
public class Categorie {

    @PostMapping(value = HTTPUtilty.CREATE)
    public void categoryCreate(){}

    @DeleteMapping(value = HTTPUtilty.DELETE)
    public void categoryDelete(@PathVariable Integer id){}

    @PutMapping(value = HTTPUtilty.UPDATE)
    public void categoryUpdate(){}

    @GetMapping(value = HTTPUtilty.GET)
    public void categoryGet(@PathVariable Integer id){}

    @PostMapping(value = HTTPUtilty.SEARCH)
    public void categorySearch(){}

}
