package school.devskill.testSpring.Persistence.Repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import school.devskill.testSpring.Model.Author;

import java.util.List;

public interface IAuthorRepository extends CrudRepository<Author, Integer> {

    @Modifying
    @Transactional
    @Query(value = "insert into author (name, surname) values (?1, ?2)", nativeQuery = true)
    void addAuthor(String n,String m);

    @Modifying
    @Transactional
    @Query(value = "delete from author where id = ?1", nativeQuery = true)
    void delById(Integer id);

    @Query(value = "delete from author",  nativeQuery = true)
    void delAllAuthors();

    @Query(value = "select * from author", nativeQuery = true)
    List<Author> getAllAuthors();

    @Query(value = "select * from author where surname = ?1", nativeQuery = true)
    List<Author> getAuthorsBySurname(String s);

}
