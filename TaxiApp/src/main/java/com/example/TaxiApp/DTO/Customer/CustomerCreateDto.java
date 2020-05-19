package com.example.TaxiApp.DTO.Customer;

import lombok.Getter;
import lombok.Setter;

import java.io.File;

@Getter
@Setter
public class CustomerCreateDto {
    private String firstName;
    private String surname;
    private String phoneNumber;
    private File image;
}
