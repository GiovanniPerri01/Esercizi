package school.devskill.testSpring.Service.Interfaces;

import school.devskill.testSpring.Model.Author;
import school.devskill.testSpring.Model.Category;

import java.util.List;

public interface ICategoryService {
    String addCategory(String name, String description);
    String delByName(String name);
    String delAllCategories();
    List<Category> getAllCategories();
}
