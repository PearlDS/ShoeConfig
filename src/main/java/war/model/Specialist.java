package war.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Specialist {
    @Id
    @GeneratedValue
    @Column(nullable = false)
    Integer id;
    @Column(nullable = false)
    String name;
    @Column(nullable = false)
    String surname;
    @Column(nullable = false)
    String phoneNumber;
    @Column(nullable = false)
    String email;

    @OneToMany(mappedBy = "specialist")
    List<TreatmentType >treatmentTypes;
    ;

    @ManyToOne()
    Activity activity;
    @OneToMany(mappedBy = "specialist")
    List<Comment> comments;
    Address address;
    boolean readyToVisit;
    boolean readyToEmergency;
}
