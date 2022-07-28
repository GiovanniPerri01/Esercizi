package school.devskill.testSpring.Service.Classes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import school.devskill.testSpring.Model.Category;
import school.devskill.testSpring.Model.Type;
import school.devskill.testSpring.Persistence.Repository.ICategoryRepository;
import school.devskill.testSpring.Persistence.Repository.ITypeRepository;
import school.devskill.testSpring.Service.Interfaces.ITypeService;

import java.util.List;

@Service
public class TypeServiceImpl implements ITypeService {

    private final ITypeRepository typeRepository;

    @Autowired
    public TypeServiceImpl(ITypeRepository typeRepository) {
        this.typeRepository = typeRepository;
    }

    @Override
    public String addType(String value){
        typeRepository.addType(value);
        return "Type saved";
    }

    @Override
    public String delByValue(String value){
        if(value!=null){
            typeRepository.delByValue(value);
            return "Type deleted";
        }
        else return "Couldn't delete type, it does not exist";
    }

    @Override
    public String delAllTypes(){
        typeRepository.delAllTypes();
        return "All types deleted";
    }

    @Override
    public List<Type> getAllTypes() {
        return typeRepository.getAllTypes();
    }
}
