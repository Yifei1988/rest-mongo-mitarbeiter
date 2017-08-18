package restservice.mitarbeiter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mitarbeiter")
public class MitarbeiterController {

    @Autowired
    private MitarbeiterRepository repository;

    /*@Autowired
    public MitarbeiterController(MitarbeiterRepository repository){
        this.repository = repository;
    }*/

    //***************************************************************************************
    //* use "application/json;charset=utf-8" as Content Type of Headers for POST/DELETE/PUT *
    //***************************************************************************************

    //======================================POST============================================
    @RequestMapping(method = RequestMethod.POST)
    Mitarbeiter create(@RequestBody Mitarbeiter mitarbeiter){

        //Mitarbeiter result = mitarbeiterRepository.save(mitarbeiter);
        return repository.insert(mitarbeiter);
    }

    //======================================DELETE============================================
    @RequestMapping(method=RequestMethod.DELETE, value="/id={id}")
    Mitarbeiter delete(@PathVariable String id) {
        Mitarbeiter deletedMitarbeiter = repository.findOne(id);
        repository.delete(id);
        return deletedMitarbeiter;
    }

    //======================================PUT=================================================
    @RequestMapping(method = RequestMethod.PUT, value = "/id={id}")
    Mitarbeiter update(@PathVariable String id, @RequestBody Mitarbeiter updatedMitarbeiter) {
        updatedMitarbeiter.setId(id);
        return repository.save(updatedMitarbeiter);
    }

    //======================================GET==================================================
    @RequestMapping(method = RequestMethod.GET, value="")
    public List<Mitarbeiter> getAll(){
        return repository.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, value="/id={id}")
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