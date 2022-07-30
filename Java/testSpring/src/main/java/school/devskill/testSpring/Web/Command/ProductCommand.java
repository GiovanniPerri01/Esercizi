package school.devskill.testSpring.Web.Command;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ProductCommand {
    private String name;
    private String title;
    private Integer author;
    private String category;
    private String type;
    private String description;
    private String size;
    private byte[] image;
}
