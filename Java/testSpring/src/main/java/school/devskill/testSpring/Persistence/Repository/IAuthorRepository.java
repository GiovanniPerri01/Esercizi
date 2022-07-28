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
    @Query(value = "insert into author (name, surname) values (:name, :surname)", nativeQuery = true)
    void addAuthor(@Param("name")String n, @Param("surname")String s);

    @Modifying
    @Transactional
    @Query(value = "delete from author where id = :id", nativeQuery = true)
    void delById(@Param("id")Integer id);

    @Modifying
    @Transactional
    @Query(value = "delete from author",  nativeQuery = true)
    void delAllAuthors();

    @Query(value = "select * from author", nativeQuery = true)
    List<Author> getAllAuthors();

    @Query(value = "select * from author where surname = :surname", nativeQuery = true)
    List<Author> getAuthorsBySurname(@Param("surname")String s);

}
