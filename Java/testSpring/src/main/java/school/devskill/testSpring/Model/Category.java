package school.devskill.testSpring.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Category {
    @Id
    @Column(length = 20)
    private String name;

    @Column(nullable = false, length = 100)
    private String description;
}
