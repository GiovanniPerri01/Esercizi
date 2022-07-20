package school.devskill.command;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
public class TurnoCommand {
    private Integer posCard1;
    private Integer posOnBoard1;
    private Integer posCard2;
    private Integer posOnBoard2;
    private Boolean attacco1;
    private Boolean attacco2;
    private Boolean plc1;
    private Boolean plc2;
}
