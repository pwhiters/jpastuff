import javax.persistence.*;


@Entity
@Table(name="Person")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Person_ID")
    private int personId;

    @Column(name = "Person_Name")
    private String personName;

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public int getPersonId() {
        return personId;
    }

//    public void setPersonId(int personId) {
//        this.personId = personId;
//    }
}