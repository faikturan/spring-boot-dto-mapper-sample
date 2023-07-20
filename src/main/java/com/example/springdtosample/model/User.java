package com.example.springdtosample.model;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String firstName;
    private String lastName;
    private String password;
    private String email;


    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "location_id")
    private Location location;


}
