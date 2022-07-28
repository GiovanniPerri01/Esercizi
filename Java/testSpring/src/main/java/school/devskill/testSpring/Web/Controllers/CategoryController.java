package school.devskill.testSpring.Web.Controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import school.devskill.testSpring.Model.Author;
import school.devskill.testSpring.Model.Category;
import school.devskill.testSpring.Service.Classes.AuthorServiceImpl;
import school.devskill.testSpring.Service.Classes.CategoryServiceImpl;
import school.devskill.testSpring.Web.Command.AuthorCommand;
import school.devskill.testSpring.Web.Command.CategoryCommand;
import school.devskill.testSpring.Web.DTO.AuthorDTO;
import school.devskill.testSpring.Web.DTO.CategoryDTO;
import school.devskill.testSpring.Utility.HTTPUtilty;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("category")
public class CategoryController {

    private final ObjectMapper mapper;
    private CategoryServiceImpl categoryServiceImpl;

    @Autowired
    public CategoryController(ObjectMapper mapper, CategoryServiceImpl categoryServiceImpl) {
        this.mapper = mapper;
        this.categoryServiceImpl = categoryServiceImpl;
    }

    @GetMapping(value = HTTPUtilty.GET_ALL)
    public List<CategoryDTO> categoryGetALl(){
        List<Category> list = categoryServiceImpl.getAllCategories();
        List<CategoryDTO> categoryDtoList = new ArrayList<>();
        for(int i = 0; i < list.size(); i++){
            try{
                categoryDtoList.add(mapper.convertValue(list.get(i),CategoryDTO.class));
            } catch (IllegalArgumentException e){
                e.printStackTrace();
            }
        }
        return categoryDtoList;
    }

    @PostMapping(value = HTTPUtilty.CREATE)
    public String categoryCreate(@RequestBody CategoryCommand category){
        return categoryServiceImpl.addCategory(category.getName(), category.getDescription());
    }

    @DeleteMapping(value = HTTPUtilty.DELETE_BY+"Name/{name}")
    public String categoryDelByName(@PathVariable String name){
        return categoryServiceImpl.delByName(name);
    }

    @DeleteMapping(value = HTTPUtilty.DELETE_ALL)
    public String categoryDelAll(){
        return categoryServiceImpl.delAllCategories();
    }

}
