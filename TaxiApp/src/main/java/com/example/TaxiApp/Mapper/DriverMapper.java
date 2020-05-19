package com.example.TaxiApp.Mapper;

import com.example.TaxiApp.DTO.Driver.DriverCreateDto;
import com.example.TaxiApp.DTO.Driver.DriverDto;
import com.example.TaxiApp.Entity.Driver;
import org.springframework.stereotype.Service;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

@Service
public class DriverMapper {

    public Driver toDriver(DriverCreateDto createDto) {
        try {
            Driver driver = new Driver();
            driver.setFirstName(createDto.getFirstName());
            driver.setPhoneNumber(createDto.getFirstName());
            driver.setSurname(createDto.getSurname());
            BufferedImage image = ImageIO.read(createDto.getPhoto());
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            ImageIO.write(image,"png",outputStream);
            driver.setPhoto(outputStream.toByteArray());
            return driver;
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public DriverDto toDto(Driver save) {
        DriverDto dto = new DriverDto();
        dto.setId(save.getId());
        dto.setFirstName(save.getFirstName());
        dto.setSurname(save.getSurname());
        dto.setPhoneNumber(save.getPhoneNumber());
        return dto;
    }
}
