package ru.spring.hibernate_test2.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "details")
public class Detail {

    @Id
    @Column(name = "id")
    private int id;
    @Column(name = "email")
    private String email;
    @Column(name = "city")
    private String city;
    @Column(name = "phone_number")
    private String phoneNumber;
}
