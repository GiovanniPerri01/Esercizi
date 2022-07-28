package school.devskill.testSpring.Service.Classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import school.devskill.testSpring.Model.Author;
import school.devskill.testSpring.Model.Category;
import school.devskill.testSpring.Persistence.Repository.IAuthorRepository;
import school.devskill.testSpring.Persistence.Repository.ICategoryRepository;
import school.devskill.testSpring.Service.Interfaces.ICategoryService;

import java.util.List;

@Service
public class CategoryServiceImpl implements ICategoryService {

    private final ICategoryRepository categoryRepository;

    @Autowired
    public CategoryServiceImpl(ICategoryRepository CategoryRepository) {
        this.categoryRepository = CategoryRepository;
    }

    @Override
    public String addCategory(String name, String description){
        categoryRepository.addCategory(name, description);
        return "Category saved";
    }

    @Override
    public String delByName(String name){
        if(name!=null){
            categoryRepository.delByName(name);
            return "Category deleted";
        }
        else return "Couldn't delete category, it does not exist";
    }

    @Override
    public String delAllCategories(){
        categoryRepository.delAllCategories();
        return "All categories deleted";
    }

    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.getAllCategories();
    }

}
