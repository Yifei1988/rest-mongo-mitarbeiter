package restservice.mitarbeiter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mitarbeiter")
public class MitarbeiterController {

    private MitarbeiterRepository repository;

    @Autowired
    public MitarbeiterController(MitarbeiterRepository repository){
        this.repository = repository;
    }


    //===========POST============================
    @RequestMapping(method = RequestMethod.POST)
    Mitarbeiter create(@RequestBody Mitarbeiter mitarbeiter){

        //Mitarbeiter result = mitarbeiterRepository.save(mitarbeiter);
        return repository.insert(mitarbeiter);
    }

    //===========DELETE==========================
    @RequestMapping(method=RequestMethod.DELETE, value="/{id}")
    Mitarbeiter delete(@PathVariable String id) {
        Mitarbeiter deletedMitarbeiter = repository.findOne(id);
        repository.delete(id);
        return deletedMitarbeiter;
    }

    //===========PUT=============================
    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    Mitarbeiter delete(@PathVariable String id, @RequestBody Mitarbeiter updatedMitarbeiter) {
        updatedMitarbeiter.setId(id);
        return repository.save(updatedMitarbeiter);
    }

    //===========GET=============================
    @RequestMapping(method = RequestMethod.GET, value="/{id}")
    public Mitarbeiter get(@PathVariable String id){
        return repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.GET, value="")
    public List<Mitarbeiter> getAll(){
        return repository.findAll();
    }
}