package school.devskill.testSpring.Web.Controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import school.devskill.testSpring.Model.Author;
import school.devskill.testSpring.Service.Classes.AuthorServiceImpl;
import school.devskill.testSpring.Service.Interfaces.IAuthorService;
import school.devskill.testSpring.Web.Command.AuthorCommand;
import school.devskill.testSpring.Web.DTO.AuthorDTO;
import school.devskill.testSpring.Utility.HTTPUtilty;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("author")
public class Autori {

    private final ObjectMapper mapper;
    private AuthorServiceImpl authorServiceImpl;

    @Autowired
    public Autori(ObjectMapper mapper, AuthorServiceImpl authorServiceImpl) {
        this.mapper = mapper;
        this.authorServiceImpl = authorServiceImpl;
    }

    @GetMapping(value = HTTPUtilty.GET_BY+"Surname/{surname}")
    public List<AuthorDTO> authorGetBySurname(@PathVariable String surname){
        List<Author> list = authorServiceImpl.getAuthorsBySurname(surname);
        List<AuthorDTO> authorDtoList = new ArrayList<>();
        for(int i = 0; i < list.size(); i++){
            authorDtoList.add(mapper.convertValue(list.get(i),AuthorDTO.class));
        }
        return authorDtoList;
    }

    @GetMapping(value = HTTPUtilty.GET_ALL)
    public List<AuthorDTO> authorGetALl(){
        List<Author> list = authorServiceImpl.getAllAuthors();
        List<AuthorDTO> authorDtoList = new ArrayList<>();
        for(int i = 0; i < list.size(); i++){
            try{
                authorDtoList.add(mapper.convertValue(list.get(i),AuthorDTO.class));
            } catch (IllegalArgumentException e){
                e.printStackTrace();
            }
        }
        return authorDtoList;
    }

    @PostMapping(value = HTTPUtilty.CREATE)
    public String authorCreate(@RequestBody AuthorCommand author){
          return authorServiceImpl.addAuthor(author.getName(), author.getSurname());
    }

    @DeleteMapping(value = HTTPUtilty.DELETE_BY+"Id/{id}")
    public String authorDelete(@PathVariable Integer id){
        return authorServiceImpl.delById(id);
    }

}
