package com.example.TaxiApp.Service;

import com.example.TaxiApp.DTO.Driver.DriverDto;
import com.example.TaxiApp.Entity.Driver;

public interface DriverService {
    DriverDto save(Driver driver);
}
