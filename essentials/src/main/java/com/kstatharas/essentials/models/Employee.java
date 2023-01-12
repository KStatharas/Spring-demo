package com.kstatharas.essentials.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@Data
@AllArgsConstructor
@Entity
@Table(name="Employee")
public class Employee {

    @Id
    @Column(name="EMPLOYEE_ID")
    private String employeeId;
    @Column(name="FIRST_NAME")
    private String firstname;
    @Column(name="LAST_NAME")
    private String lastname;
    @Column(name="POSITION")
    @Enumerated(EnumType.STRING)
    private Position position;

    public Employee() {
        this.employeeId = UUID.randomUUID().toString();
    }

}
