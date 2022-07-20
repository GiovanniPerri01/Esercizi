package school.devskill.web.controller;

import org.springframework.web.bind.annotation.*;
import school.devskill.command.PlayersCommand;
import school.devskill.command.TurnoCommand;
import school.devskill.service.implementation.BoardManager;
import school.devskill.service.interfaces.IBoardManager;

@RestController
@RequestMapping("carte")
public class GiocoController {
    protected final BoardManager board;

    public GiocoController(BoardManager board){
        this.board = board;
    }

    @PostMapping("/addPlayers")
    public String addPlayers(@RequestBody PlayersCommand players){
        return board.addPlayers(players);
    }

    @PostMapping("/giocaTurno")
    public String giocaTurno(@RequestBody TurnoCommand turno){
        return board.giocaTurno(turno);
    }

    @PostMapping("/reset")
    public String reset(){
        return board.reset();
    }

    @GetMapping("/statoPartita")
    public String statoPartita(){
        return board.statoPartita();
    }
}
