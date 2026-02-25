package lt.viko.eif.jkozlovski.first.spring.boot.model;

import jakarta.persistence.*;

@Entity
@Table(name = "customer")
public class Customer extends BaseEntity {
    private String firstName;
    private String lastName;
    private String email;

    public Customer() {
    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
