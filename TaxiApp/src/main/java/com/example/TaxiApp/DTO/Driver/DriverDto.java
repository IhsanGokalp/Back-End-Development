package com.example.TaxiApp.DTO.Driver;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class DriverDto {
    private Long id;
    private String firstName;
    private String surname;
    private String phoneNumber;
}
