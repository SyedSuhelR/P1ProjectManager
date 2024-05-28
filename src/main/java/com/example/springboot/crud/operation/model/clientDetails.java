package com.example.springboot.crud.operation.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Set;

@Entity
@Setter
@Getter
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="clientDetails")
public class clientDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    private String clientName;
    private String Email;
    private String Adress;
//    @ManyToOne
//    @JoinColumn(name = "projectId")
//    private ProjectDetails projectDetails;
//
//    @ManyToMany(mappedBy = "clientDetails")
//    private Set<ProjectDetails> projects;


    @OneToMany(mappedBy = "clientDetails")
    private List<ProjectDetails> project;

    @ManyToMany
    @JoinTable(name = "clientDetails",
    joinColumns = @JoinColumn(name = "clientid"),
            inverseJoinColumns = @JoinColumn(name = "EmployeeId"))
    private List<Employee> Employee;
//    public Employee getUserid() {
//        return userid;
//    }
//
//    public void setUserid(Employee userid) {
//        this.userid = userid;
//    }
//
//    public ProjectDetails getProjectId() {
//        return projectId;
//    }
//
//    public void setProjectId(ProjectDetails projectId) {
//        this.projectId = projectId;
//    }


    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String adress) {
        Adress = adress;
    }

    @Override
    public String toString() {
        return "clientDetails{" +
                "Id=" + Id +
                ", clientName='" + clientName + '\'' +
                ", Email='" + Email + '\'' +
                ", Adress='" + Adress + '\'' +
                '}';
    }
}
