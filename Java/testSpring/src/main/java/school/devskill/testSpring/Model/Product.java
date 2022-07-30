package school.devskill.testSpring.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Product {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 20)
    private String name;

    @Column(nullable = false, length = 25)
    private String title;

    @Column(columnDefinition = "TEXT")
    String description;

    @Column(length = 15)
    private String size;

    @Column(columnDefinition = "LONGBLOB")
    @Lob
    private byte[] image;

    @ManyToOne
    @JoinColumn(name = "author", nullable = false)
    private Author author;

    @ManyToOne
    @JoinColumn(name = "category", nullable = false)
    private Category category;

    @ManyToOne
    @JoinColumn(name = "type", nullable = false)
    private Type type;

}
