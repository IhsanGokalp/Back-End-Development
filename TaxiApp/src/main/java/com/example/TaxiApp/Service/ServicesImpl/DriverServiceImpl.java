package com.example.TaxiApp.Service.ServicesImpl;

import com.example.TaxiApp.DTO.Driver.DriverDto;
import com.example.TaxiApp.Entity.Driver;
import com.example.TaxiApp.Mapper.DriverMapper;
import com.example.TaxiApp.Repository.DriverRepository;
import com.example.TaxiApp.Service.DriverService;
import org.springframework.stereotype.Service;

@Service
public class DriverServiceImpl implements DriverService {

    private DriverRepository driverRepository;
    private DriverMapper driverMapper;

    @Override
    public DriverDto save(Driver driver) {
        return driverMapper.toDto(driverRepository.save(driver));
      }
}
