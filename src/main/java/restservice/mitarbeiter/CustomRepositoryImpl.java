package restservice.mitarbeiter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.util.List;

public class CustomRepositoryImpl implements MitarbeiterCustomRepository{
    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public List<Mitarbeiter> findByName(String name) {
        Criteria criteria = new Criteria();
        criteria.where("name").is(name);
        Query query = new Query(criteria);
        List<Mitarbeiter> mitarbeiterList = this.mongoTemplate.find(query, Mitarbeiter.class);
        return mitarbeiterList;
    }
}
