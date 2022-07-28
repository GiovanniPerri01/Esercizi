package school.devskill.testSpring.Service.Classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import school.devskill.testSpring.Model.Author;
import school.devskill.testSpring.Persistence.Repository.IAuthorRepository;
import school.devskill.testSpring.Service.Interfaces.IAuthorService;
import school.devskill.testSpring.Web.DTO.AuthorDTO;

import java.util.List;

@Service
public class AuthorServiceImpl implements IAuthorService {

    private final IAuthorRepository authorRepository;

    @Autowired
    public AuthorServiceImpl(IAuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public String addAuthor(String name, String surname){
        authorRepository.addAuthor(name, surname);
        return "Author saved";
    }

    @Override
    public String delById(Integer id){
        if(id!=null){
            authorRepository.delById(id);
            return "Author deleted";
        }
        else return "Couldn't delete author, it does not exist";
    }

    @Override
    public String delAllAuthors(){
        authorRepository.delAllAuthors();
        return "All authors deleted";
    }

    @Override
    public List<Author> getAllAuthors() {
        return authorRepository.getAllAuthors();
    }

    @Override
    public List<Author> getAuthorsBySurname(String surname) {
        return authorRepository.getAuthorsBySurname(surname);
    }
}
