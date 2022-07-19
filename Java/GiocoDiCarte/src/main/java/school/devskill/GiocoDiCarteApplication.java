package school.devskill;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import school.devskill.elementidigioco.Player;
import school.devskill.service.implementation.BoardManager;

@SpringBootApplication
public class GiocoDiCarteApplication {

	public static void main(String[] args) {
	//	SpringApplication.run(GiocoDiCarteApplication.class, args);
		Player p1 = new Player("Mario");
		Player p2 = new Player("Giovanni");
		BoardManager board = new BoardManager(p1, p2);

		System.out.println(board.daiCarta());
	}
}
