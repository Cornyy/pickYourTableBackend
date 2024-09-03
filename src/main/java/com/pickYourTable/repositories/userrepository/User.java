package com.pickYourTable.repositories.userrepository;

import lombok.*;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "USERS")
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "LOGIN")
    private String login;

    @Column(name = "PASSWORD")
    private String password;

    @Column(name = "NAME")
    private String name;

    @Column(name = "SURNAME")
    private String surname;

    @Column(name = "CITY")
    private String city;

    @Column(name = "DATE_OF_BIRTH")
    private LocalDate dateOfBirth;

    @Column(name = "REGISTER_DATE")
    private LocalDate registerDate;

    @Column(name = "LAST_LOGIN_DATE")
    private LocalDate lastLoginDate;

    @Column(name = "IS_ACTIVE")
    private Boolean isActive;

    @Column(name = "VERIFICATION_CODE")
    private String verificationCode;

}
