package school.devskill.testSpring.Persistence.Repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import school.devskill.testSpring.Model.Author;
import school.devskill.testSpring.Model.User;

import java.util.List;

public interface IUserRepository extends CrudRepository<User, Integer> {

    @Modifying
    @Transactional
    @Query(value = "insert into user (name, surname, username, password) values (:name, :surname, :username, :password)", nativeQuery = true)
    void addUser(@Param("name")String n, @Param("surname")String s, @Param("username")String u, @Param("password")String p);

    @Modifying
    @Transactional
    @Query(value = "delete from user where id = :id", nativeQuery = true)
    void delById(@Param("id")Integer id);

    @Modifying
    @Transactional
    @Query(value = "delete from user",  nativeQuery = true)
    void delAllUsers();

    @Query(value = "select * from user", nativeQuery = true)
    List<User> getAllUsers();

    @Query(value = "select * from user where name = :name", nativeQuery = true)
    List<User> getUsersByName(@Param("name")String n);
}
