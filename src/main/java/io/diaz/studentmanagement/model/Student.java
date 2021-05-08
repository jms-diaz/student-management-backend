package io.diaz.studentmanagement.model;

import javax.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String email;
    private String section;
    private String imageUrl;
    @Column(nullable = false, updatable = false)
    private String studentCode;

    public Student() {}

    public Student(Long id, String name, String email, String section, String imageUrl, String studentCode) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.section = section;
        this.imageUrl = imageUrl;
        this.studentCode = studentCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", section='" + section + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", studentCode='" + studentCode + '\'' +
                '}';
    }
}
