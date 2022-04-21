package com.cydeo.entity;

import com.cydeo.enums.Gender;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="employees")
@NoArgsConstructor
@Data
public class Employee extends BaseEntity{

    private String first_name;
    private String last_name;
    private String email;
    @Column(columnDefinition = "DATE")
    private LocalDate hire;
    private int salary;
    
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @OneToOne
    @JoinColumn(name = "department_id")
    private Department department;

    public Employee(String first_name, String last_name, String email, LocalDate hire, Gender gender, int salary) {
    this.first_name = first_name;
    this.last_name = last_name;
    this.email = email;
    this.hire = hire;
    this.gender = gender;
    this.salary = salary;
    }
}
