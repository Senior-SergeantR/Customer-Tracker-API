package io.javabrains.patienttracker.entity;

import jakarta.persistence.*;

@Entity
@Table(name="Customer_Issues")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_Name")
    private String firstName;
    @Column(name = "last_Name")
    private String lastName;
    @Column(name = "email")
    private String email;
    @Column(name = "issue")
    private String issue;
    @Column(name = "priority")
    private String priority;

    public Customer() {
    }

    public Customer(String firstName, String lastName, String email, String issue, String priority) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.issue = issue;
        this.priority = priority;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public void setLastName(String lastname) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }


}
