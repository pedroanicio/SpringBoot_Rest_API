package br.com.pedro.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;


@Entity
@Table(name = "person") // corresponde a person no banco
public class Person implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "First_Name" , nullable = false, length = 80)
    private String FirstName;

    @Column(name = "Last_Name", nullable = false, length = 80)
    private String LastName;

    @Column(name = "address", nullable = false, length = 100)
    private String addres;

    @Column(nullable = false, length = 6)
    private String gender;

    public Person() {}

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;
        return Objects.equals(id, person.id) && Objects.equals(FirstName, person.FirstName) && Objects.equals(LastName, person.LastName) && Objects.equals(addres, person.addres) && Objects.equals(gender, person.gender);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(id);
        result = 31 * result + Objects.hashCode(FirstName);
        result = 31 * result + Objects.hashCode(LastName);
        result = 31 * result + Objects.hashCode(addres);
        result = 31 * result + Objects.hashCode(gender);
        return result;
    }
}
