package school.devskill.testSpring.Web.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import school.devskill.testSpring.Model.Author;
import school.devskill.testSpring.Model.Category;
import school.devskill.testSpring.Model.Type;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {
    private Integer id;
    private String name;
    private String title;
    private String description;
    private String size;
    private byte[] image;
    private Author author;
    private Category category;
    private Type type;
}
