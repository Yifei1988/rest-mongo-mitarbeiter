package restservice.mitarbeiter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by xiy4abt on 8/16/17.
 */
@RestController
@RequestMapping("/mitarbeiter")
public class MitarbeiterController {

    @Autowired
    private MitarbeiterRepository repository;

    //======================================POST============================================
    @RequestMapping(method = RequestMethod.POST)
    Mitarbeiter create(@RequestBody Mitarbeiter mitarbeiter){
        return repository.insert(mitarbeiter);
    }

    //======================================DELETE============================================
    @RequestMapping(method=RequestMethod.DELETE, value="/{id}")
    Mitarbeiter delete(@PathVariable String id) {
        Mitarbeiter deletedMitarbeiter = repository.findOne(id);
        repository.delete(id);
        return deletedMitarbeiter;
    }

    //======================================PUT=================================================
    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    Mitarbeiter update(@PathVariable String id, @RequestBody Mitarbeiter updatedMitarbeiter) {
        updatedMitarbeiter.setId(id);
        return repository.save(updatedMitarbeiter);
    }

    //======================================GET==================================================
    @RequestMapping(method = RequestMethod.GET, value="")
    public List<Mitarbeiter> getAll(){
        return repository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, value="/{id}")
    public Mitarbeiter getById(@PathVariable String id){
        return repository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.GET, value="/name={name}")
    @ResponseBody
    public List<Mitarbeiter> getAllByName(@PathVariable String name){
        return repository.findByName(name);
    }

    @RequestMapping(method = RequestMethod.GET, value="/vorname={vorname}")
    @ResponseBody
    public List<Mitarbeiter> getAllByVorname(@PathVariable String vorname){
        return repository.findByVorname(vorname);
    }
}