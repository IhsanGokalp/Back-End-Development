package com.example.TaxiApp.Controller;

import com.example.TaxiApp.DTO.Driver.DriverCreateDto;
import com.example.TaxiApp.DTO.Driver.DriverDto;
import com.example.TaxiApp.Entity.Driver;
import com.example.TaxiApp.Mapper.DriverMapper;
import com.example.TaxiApp.Service.DriverService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/drivers")
public class DriverController {
    private DriverService driverService;
    private DriverMapper driverMapper;

    public DriverController(DriverService driverService, DriverMapper driverMapper) {
        this.driverService = driverService;
        this.driverMapper = driverMapper;
    }

    @PostMapping
    private DriverDto save(DriverCreateDto createDto) {
        Driver driver = driverMapper.toDriver(createDto);
        return driverService.save(driver);
    }

}
