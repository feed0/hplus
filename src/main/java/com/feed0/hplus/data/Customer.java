package com.feed0.hplus.data;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="CUSTOMER")
public class Customer {

    @Id
    @Column(name="CUSTOMER_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private long id;

    @Column(name="FIRST_NAME")
    @Getter @Setter
    private String firstName;

    @Column(name="LAST_NAME")
    @Getter @Setter
    private String lastName;

    @Column(name="EMAIL")
    @Getter @Setter
    private String email;

    @Column(name="PHONE")
    @Getter @Setter
    private String phoneNumber;

    @Column(name="ADDRESS")
    @Getter @Setter
    private String address;

    @Column(name="CITY")
    @Getter @Setter
    private String city;

    @Column(name="STATE")
    @Getter @Setter
    private String state;

    @Column(name="ZIPCODE")
    @Getter @Setter
    private String zipCode;
}
