package school.devskill.GiocoDellOca.Web.Controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import school.devskill.GiocoDellOca.Eccezioni.GiocoInCorsoException;
import school.devskill.GiocoDellOca.ElementiDiGioco.InfoPlayer;
import school.devskill.GiocoDellOca.ElementiDiGioco.Player;
import school.devskill.GiocoDellOca.Service.ServiceOca;

@RestController
@RequestMapping("oca")
public class GameController{
    protected final ServiceOca boardManager;
    protected final ObjectMapper micheal;

    @Autowired
    public GameController(ServiceOca boardManager, ObjectMapper micheal) {
        this.boardManager = boardManager;
        this.micheal = micheal;
    }

    @PostMapping("/reset")
    public String reset(){
        return boardManager.reset();
    }

    @GetMapping("/statoPartita")
    public String statoPartita(){
        return boardManager.statoPartita();
    }

    @PostMapping("/aggiungiGiocatore")
    public String addPlayer(@RequestBody InfoPlayer i) throws GiocoInCorsoException {
        Player p = micheal.convertValue(i,Player.class);
        return boardManager.addPlayer(p);
    }

    @PostMapping("/giocaTurno")
    public String giocaTurno(){
        return boardManager.giocaTurno();
    }
}