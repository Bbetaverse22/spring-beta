package com.cydeo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "regions")
@NoArgsConstructor
public class Region {

    @Id
    private Long id;

    private String region;
    private String country;

}
