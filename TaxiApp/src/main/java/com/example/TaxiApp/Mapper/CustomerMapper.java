package com.example.TaxiApp.Mapper;

import com.example.TaxiApp.DTO.Customer.CustomerCreateDto;
import com.example.TaxiApp.DTO.Customer.CustomerDto;
import com.example.TaxiApp.Entity.Customer;
import org.springframework.stereotype.Service;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

@Service
public class CustomerMapper {
    public Customer toCustomer(CustomerCreateDto createDto) {
        try {
            Customer newCustomer = new Customer();
            newCustomer.setFirstName(createDto.getFirstName());
            newCustomer.setPhoneNumber(createDto.getPhoneNumber());
            newCustomer.setSurname(createDto.getSurname());
            BufferedImage image = ImageIO.read(createDto.getImage());
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            ImageIO.write(image,"png",outputStream);
            newCustomer.setPhoto(outputStream.toByteArray());
            return newCustomer;
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    public CustomerDto toCustomerDto(Customer customer) {
        CustomerDto dto = new CustomerDto();
        dto.setFirstName(customer.getFirstName());
        dto.setId(customer.getId());
        dto.setPhoneNumber(customer.getPhoneNumber());
        dto.setSurname(customer.getSurname());
        return dto;
    }
}
