package school.devskill.testSpring.Persistence.Repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import school.devskill.testSpring.Model.Author;
import school.devskill.testSpring.Model.Category;

import java.util.List;

public interface ICategoryRepository extends CrudRepository<Category, String> {
    @Modifying
    @Transactional
    @Query(value = "insert into category (name, description) values (:name, :description)", nativeQuery = true)
    void addCategory(@Param("name")String n, @Param("description")String d);

    @Modifying
    @Transactional
    @Query(value = "delete from category where name = :name", nativeQuery = true)
    void delByName(@Param("name")String n);

    @Modifying
    @Transactional
    @Query(value = "delete from category",  nativeQuery = true)
    void delAllCategories();

    @Query(value = "select * from category", nativeQuery = true)
    List<Category> getAllCategories();

}
