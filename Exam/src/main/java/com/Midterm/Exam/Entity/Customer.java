package com.Midterm.Exam.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "cutomers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "email_address")
    private String emailAddress;

    @Column(name = "job_title")
    private String jobTitle;

    @Column(name = "mobile_phone")
    private String mobilePhone;

    @Column(name = "city")
    private String city;

    @Column(name = "web_page")
    private String webPage;

}