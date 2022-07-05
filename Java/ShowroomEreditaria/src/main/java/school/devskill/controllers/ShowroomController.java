package school.devskill.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import school.devskill.Gestione;

@RestController
@RequestMapping("showroom/")
public class ShowroomController {

    @GetMapping("piuVecchio")
    public String piuVecchio(){
        return Gestione.vecchio();
    }

    @GetMapping("piuNuovo")
    public String piuNuovo(){
        return Gestione.nuovo();
    }

    @GetMapping("media")
    public String prezzoMedio(){
       return Gestione.media().get(0) + "\n" + Gestione.media().get(1) + "\n" + Gestione.media().get(2);
    }

}
