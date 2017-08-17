package restservice.mitarbeiter;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface MitarbeiterRepository extends MongoRepository <Mitarbeiter, String> {
}