package school.devskill.testSpring.Persistence.Repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import school.devskill.testSpring.Model.Author;
import school.devskill.testSpring.Model.Type;

import java.util.List;

public interface ITypeRepository extends CrudRepository<Type, String> {

    @Modifying
    @Transactional
    @Query(value = "insert into type (value) values (:value)", nativeQuery = true)
    void addType(@Param("value")String v);

    @Modifying
    @Transactional
    @Query(value = "delete from type where value = :value", nativeQuery = true)
    void delByValue(@Param("value")String value);

    @Modifying
    @Transactional
    @Query(value = "delete from type",  nativeQuery = true)
    void delAllTypes();

    @Query(value = "select * from type", nativeQuery = true)
    List<Type> getAllTypes();

}
