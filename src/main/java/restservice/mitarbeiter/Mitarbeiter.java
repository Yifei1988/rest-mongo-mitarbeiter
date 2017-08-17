package restservice.mitarbeiter;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="mitarbeiters")
public class Mitarbeiter {

    @Id
    private String id;

    private String vorname;
    private String name;

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getVorname() {
        return vorname;
    }
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}