package school.devskill.testSpring.Model;

import lombok.*;
import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(nullable = false, length = 20)
    private String name;

    @Column(length = 20)
    private String surname;
}
