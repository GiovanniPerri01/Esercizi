package school.devskill.testSpring.Persistence.Repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import school.devskill.testSpring.Model.Author;
import school.devskill.testSpring.Model.Product;

import java.sql.Blob;
import java.util.List;

public interface IProductRepository extends CrudRepository<Product, Integer> {

    @Modifying
    @Transactional
    @Query(value = "insert into product (name, title, author, category, type, description, size, image) " +
            "values (:name, :title, :author, " +
            ":category, :type, :description, :size, :image)", nativeQuery = true)
    void addProduct(@Param("name")String n, @Param("title")String title,
                    @Param("author")Integer id, @Param("category")String c,
                    @Param("type")String type, @Param("description")String d,
                    @Param("size")String s, @Param("image")byte[] i);

    @Modifying
    @Transactional
    @Query(value = "delete from product where id = :id", nativeQuery = true)
    void delById(@Param("id")Integer id);

    @Modifying
    @Transactional
    @Query(value = "delete from product",  nativeQuery = true)
    void delAllProducts();

    @Query(value = "select * from product", nativeQuery = true)
    List<Product> getAllProducts();

    @Query(value = "select * from product where name = :name", nativeQuery = true)
    List<Product> getProductsByName(@Param("name")String n);

}
