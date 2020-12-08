package war.model;

import javax.persistence.*;
import java.util.List;

//@NamedQuery(name = "client",
//        query = "select a from User a where a= client")
@Entity
public class Client {
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
    Comment comment;

    @OneToMany(mappedBy = "client")
    List<Appointment> appointment;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }
}
