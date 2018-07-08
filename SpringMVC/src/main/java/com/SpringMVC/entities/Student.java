package com.SpringMVC.entities;

import java.util.HashSet;
import java.util.Set;

import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
public class Student extends Entity {
    String name;
    String email;
    String address;
    String telephone;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    //@Relationship(type = "ENROLLED")
    //Set<Enrollment> enrollments;
    // @Relationship(type = "BUDDY", direction = Relationship.INCOMING)
    // Set<StudyBuddy> studyBuddies;

    @Relationship(type = "ENROLLED", direction = Relationship.OUTGOING)
    private Set<Course> courses = new HashSet<Course>();

    public Student() {

    }
    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(String name) {
        super();
        this.name = name;
    }

//    public long getId() {
//        return this.getIdGraph();
//    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + getId() + '\'' +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", telephone='" + telephone + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (name != null ? !name.equals(student.name) : student.name != null) return false;
        if (email != null ? !email.equals(student.email) : student.email != null) return false;
        if (address != null ? !address.equals(student.address) : student.address != null) return false;
        return telephone != null ? telephone.equals(student.telephone) : student.telephone == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (telephone != null ? telephone.hashCode() : 0);
        return result;
    }
}
