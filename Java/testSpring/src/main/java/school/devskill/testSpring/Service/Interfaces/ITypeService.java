package school.devskill.testSpring.Service.Interfaces;

import school.devskill.testSpring.Model.Category;
import school.devskill.testSpring.Model.Type;

import java.util.List;

public interface ITypeService {
    String addType(String value);
    String delByValue(String value);
    String delAllTypes();
    List<Type> getAllTypes();
}
