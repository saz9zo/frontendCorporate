import javax.persistence.*; 

@Entity
@Table(name="contactQuery")
public class queryPojo {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email;
    private String phone;
    private String query;


    public void setName (String name) {
        this.name =name;
    }

    public String getName () {
        return name;
    }
    public void setEmail (String email) {
        this.email =email;
    }

    public String getEmail () {
        return email;
    }
    public void setPhone (String phone) {
        this.phone =phone;
    }

    public String getPhone () {
        return phone;
    }
    public void setQuery (String query) {
        this.query =query;
    }

    public String getQuery () {
        return query;
    }
}