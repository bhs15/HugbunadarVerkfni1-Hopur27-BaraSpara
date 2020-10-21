package is.hi.hbv501g.BaraSpara.Services.Implementations;

import is.hi.hbv501g.BaraSpara.Entities.SavingType;
import is.hi.hbv501g.BaraSpara.Repositories.SavingTypeRepo;
import is.hi.hbv501g.BaraSpara.Services.SavingTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class SavingTypeServiceImplementation implements SavingTypeService {

    SavingTypeRepo repo;

    @Autowired
    public SavingTypeServiceImplementation(SavingTypeRepo savingTypeRepository){
        this.repo = savingTypeRepository;
    }

    @Override
    public SavingType save(SavingType savingType) {
        return repo.save(savingType);
    }

    @Override
    public void delete(SavingType savingType) {
        repo.delete(savingType);
        return;
    }

    @Override
    public List<SavingType> findAll() {
        return repo.findAll();
    }

    @Override
    public List<SavingType> findByTitle(String title) {
        return repo.findByTitle(title);
    }

    @Override
    public Optional<SavingType> findById(long id) {
        return repo.findById(id);
    }
}
