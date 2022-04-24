package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "departments")
@NoArgsConstructor
public class Department {

    @Id
    private String department;

    private String division;
}
