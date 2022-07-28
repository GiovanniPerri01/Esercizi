package school.devskill.testSpring.Service.Interfaces;

import school.devskill.testSpring.Model.Author;
import school.devskill.testSpring.Persistence.Repository.IAuthorRepository;

import java.util.List;
import java.util.Optional;

public interface IAuthorService{
    String addAuthor(String name, String surname);
    String delById(Integer id);
    String delAllAuthors();
    List<Author> getAllAuthors();
    List<Author> getAuthorsBySurname(String surname);

}
