package com.Midterm.Exam.Dao;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
public class CustomerCreateDao {
    @NotBlank
    private String firstName;
    @NotBlank
    private String lastName;
    @NotBlank
    @Email
    private String emailAddress;
    @NotBlank
    private String jobTitle;
    private String mobilePhone;
    @NotBlank
    private String city;
    @NotBlank
    private String webPage;
}
