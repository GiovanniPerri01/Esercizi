package school.devskill.testSpring.Web.Controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import school.devskill.testSpring.Model.Product;
import school.devskill.testSpring.Service.Classes.ProductServiceImpl;
import school.devskill.testSpring.Utility.HTTPUtilty;
import school.devskill.testSpring.Web.Command.ProductCommand;
import school.devskill.testSpring.Web.DTO.ProductDTO;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("product")
public class ProductController {

    private final ObjectMapper mapper;
    private ProductServiceImpl productServiceImpl;

    @Autowired
    public ProductController(ObjectMapper mapper, ProductServiceImpl productServiceImpl) {
        this.mapper = mapper;
        this.productServiceImpl = productServiceImpl;
    }

    @GetMapping(value = HTTPUtilty.GET_BY+"Name/{name}")
    public List<ProductDTO> productGetByName(@PathVariable String name){
        List<Product> list = productServiceImpl.getProductsByName(name);
        List<ProductDTO> productDtoList = new ArrayList<>();
        for(int i = 0; i < list.size(); i++){
            productDtoList.add(mapper.convertValue(list.get(i), ProductDTO.class));
        }
        return productDtoList;
    }

    @GetMapping(value = HTTPUtilty.GET_ALL)
    public List<ProductDTO> productGetALl(){
        List<Product> list = productServiceImpl.getAllProducts();
        List<ProductDTO> productDtoList = new ArrayList<>();
        for(int i = 0; i < list.size(); i++){
            try{
                productDtoList.add(mapper.convertValue(list.get(i),ProductDTO.class));
            } catch (IllegalArgumentException e){
                e.printStackTrace();
            }
        }
        return productDtoList;
    }

    @PostMapping(value = HTTPUtilty.CREATE)
    public String productCreate(@RequestBody ProductCommand product){
        return productServiceImpl.addProduct(product.getName(), product.getTitle(),
                product.getAuthor(), product.getCategory(), product.getType(),
                product.getDescription(), product.getSize(), product.getImage());
    }

    @DeleteMapping(value = HTTPUtilty.DELETE_BY+"Id/{id}")
    public String productDelById(@PathVariable Integer id){
        return productServiceImpl.delById(id);
    }

    @DeleteMapping(value = HTTPUtilty.DELETE_ALL)
    public String productDelAll(){
        return productServiceImpl.delAllProducts();
    }

}
