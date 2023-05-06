package com.internship.APMCproject.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Users_List")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userid;

    private String name;
    private String password;
    private String emailid;
    private String dob;
    private String state;
    private String district;
    private String gender;
    private Long mobile;
}
