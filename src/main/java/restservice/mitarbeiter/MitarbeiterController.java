package restservice.mitarbeiter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/mitarbeiter")
public class MitarbeiterController {

    @Autowired
    MitarbeiterRepository mitarbeiterRepository;

    @RequestMapping(method = RequestMethod.POST)
    public Mitarbeiter create(@RequestBody Mitarbeiter mitarbeiter){

        Mitarbeiter result = mitarbeiterRepository.save(mitarbeiter);
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value="/{mitarbeiterId}")
    public Mitarbeiter get(@PathVariable String mitarbeiterId){
        return mitarbeiterRepository.findOne(mitarbeiterId);
    }

    @RequestMapping(method = RequestMethod.GET, value="")
    public List<Mitarbeiter> getAll(){
        return mitarbeiterRepository.findAll();
    }
}