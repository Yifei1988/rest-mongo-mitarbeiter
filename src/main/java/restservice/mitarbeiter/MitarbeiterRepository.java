package restservice.mitarbeiter;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MitarbeiterRepository
        extends MongoRepository <Mitarbeiter, String>, MitarbeiterCustomRepository {
}