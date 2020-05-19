package com.example.TaxiApp.DTO.Driver;

import com.example.TaxiApp.DTO.Car.CarCreateDto;
import com.example.TaxiApp.Entity.Car;
import lombok.Getter;
import lombok.Setter;

import java.io.File;
import java.util.ArrayList;

@Setter
@Getter
public class DriverCreateDto {
    private Long id;
    private String firstName;
    private String surname;
    private String phoneNumber;
    private File photo;
    private ArrayList<CarCreateDto> cars;
}
