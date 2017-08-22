package restservice.mitarbeiter;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by xiy4abt on 8/16/17.
 */
@Repository
public interface MitarbeiterRepository extends MongoRepository <Mitarbeiter, String> {
    List<Mitarbeiter> findByName(String name);
    List<Mitarbeiter> findByVorname(String vorname);
}