package school.devskill.testSpring.Service.Classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import school.devskill.testSpring.Model.Author;
import school.devskill.testSpring.Model.Product;
import school.devskill.testSpring.Persistence.Repository.IAuthorRepository;
import school.devskill.testSpring.Persistence.Repository.IProductRepository;
import school.devskill.testSpring.Service.Interfaces.IProductService;

import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {

    private final IProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(IProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public String addProduct(String name, String title, Integer author, String category,
                             String type, String description, String size, byte[] image){
        productRepository.addProduct(name, title, author, category, type, description, size, image);
        return "Product saved";
    }

    @Override
    public String delById(Integer id){
        if(id!=null){
            productRepository.delById(id);
            return "Product deleted";
        }
        else return "Couldn't delete product, it does not exist";
    }

    @Override
    public String delAllProducts(){
        productRepository.delAllProducts();
        return "All products deleted";
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.getAllProducts();
    }

    @Override
    public List<Product> getProductsByName(String name) {
        return productRepository.getProductsByName(name);
    }

}
