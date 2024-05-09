package br.com.pedro.data.vo.v1;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;



public class PersonVO implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String FirstName;
    private String LastName;
    private String addres;
    private String gender;

    public PersonVO() {}

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

        PersonVO person = (PersonVO) o;
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
