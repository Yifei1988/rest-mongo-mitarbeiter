package restservice.mitarbeiter;

import java.util.List;

public interface MitarbeiterCustomRepository {
    List<Mitarbeiter> findByName(String name);
}
