package war.model;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Appointment {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @ManyToOne
    private List<Specialist> specialists;

    @ManyToOne(optional = false)//Many to Many??
    private Client client;
    private LocalDateTime startTime;
    private LocalDateTime endTime;

}
