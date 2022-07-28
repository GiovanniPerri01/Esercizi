package school.devskill.testSpring.Web.Controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import school.devskill.testSpring.Model.Category;
import school.devskill.testSpring.Model.Type;
import school.devskill.testSpring.Service.Classes.CategoryServiceImpl;
import school.devskill.testSpring.Service.Classes.TypeServiceImpl;
import school.devskill.testSpring.Utility.HTTPUtilty;
import school.devskill.testSpring.Web.Command.CategoryCommand;
import school.devskill.testSpring.Web.Command.TypeCommand;
import school.devskill.testSpring.Web.DTO.CategoryDTO;
import school.devskill.testSpring.Web.DTO.TypeDTO;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("type")
public class TypeController {

    private final ObjectMapper mapper;
    private TypeServiceImpl typeServiceImpl;

    @Autowired
    public TypeController(ObjectMapper mapper, TypeServiceImpl typeServiceImpl) {
        this.mapper = mapper;
        this.typeServiceImpl = typeServiceImpl;
    }

    @GetMapping(value = HTTPUtilty.GET_ALL)
    public List<TypeDTO> typeGetALl(){
        List<Type> list = typeServiceImpl.getAllTypes();
        List<TypeDTO> typeDtoList = new ArrayList<>();
        for(int i = 0; i < list.size(); i++){
            try{
                typeDtoList.add(mapper.convertValue(list.get(i), TypeDTO.class));
            } catch (IllegalArgumentException e){
                e.printStackTrace();
            }
        }
        return typeDtoList;
    }

    @PostMapping(value = HTTPUtilty.CREATE)
    public String typeCreate(@RequestBody TypeCommand type){
        return typeServiceImpl.addType(type.getValue());
    }

    @DeleteMapping(value = HTTPUtilty.DELETE_BY+"Value/{value}")
    public String typeDelByValue(@PathVariable String value){
        return typeServiceImpl.delByValue(value);
    }

    @DeleteMapping(value = HTTPUtilty.DELETE_ALL)
    public String typeDelAll(){
        return typeServiceImpl.delAllTypes();
    }

}
