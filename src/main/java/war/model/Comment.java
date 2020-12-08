package war.model;

import javax.persistence.*;
import java.sql.Date;
@Entity
public class Comment {
    @Id
    @GeneratedValue
    Integer id;
    @ManyToOne
    Specialist specialist;
    String words;
    Date dayOfComment;
    Integer points;
    @OneToOne
    Client client;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Specialist getSpecialist() {
        return specialist;
    }

    public void setSpecialist(Specialist specialist) {
        this.specialist = specialist;
    }

    public String getWords() {
        return words;
    }

    public void setWords(String words) {
        this.words = words;
    }

    public Date getDayOfComment() {
        return dayOfComment;
    }

    public void setDayOfComment(Date dayOfComment) {
        this.dayOfComment = dayOfComment;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
