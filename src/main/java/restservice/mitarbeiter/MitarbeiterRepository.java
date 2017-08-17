package restservice.mitarbeiter;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MitarbeiterRepository extends MongoRepository <Mitarbeiter, String> {
}