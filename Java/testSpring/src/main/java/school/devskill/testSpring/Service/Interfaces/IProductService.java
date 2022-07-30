package school.devskill.testSpring.Service.Interfaces;

import school.devskill.testSpring.Model.Product;
import java.util.List;

public interface IProductService {
    String addProduct(String name,String title,Integer author,String category,String type, String description, String size, byte[] image);
    String delById(Integer id);
    String delAllProducts();
    List<Product> getAllProducts();
    List<Product> getProductsByName(String name);
}
