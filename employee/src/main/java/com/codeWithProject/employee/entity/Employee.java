package com.codeWithProject.employee.entity;

import jakarta.persistence.*;
import lombok.Data;
@Entity
@Data
@Table(name="employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;

    @Column(name = "country")
    private String country;

    @Column(name = "mobile")
    private String mobile;

    @Column(name = "email")
    private String email;
}
