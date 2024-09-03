package com.pickYourTable.repositories.restaurantrepository;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "RESTAURANTS")
public class Restaurant {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "CITY")
    private String city;

    @Column(name = "POSTAL_CODE")
    private String postalCode;

    @Column(name = "STREET")
    private String street;

    @Column(name = "LOCAL_NUMBER")
    private String localNumber;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;

    @Column(name = "MAIL")
    private String email;

    @Column(name = "COUSINE_TYPE")
    private CousineTypeEnum cousineType;
}
