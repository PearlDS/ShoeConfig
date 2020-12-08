package war.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class TreatmentType {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    @ManyToOne()
    Specialist spesialist;
}
