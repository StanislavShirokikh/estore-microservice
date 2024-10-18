package ru.isands.test.estore.dto;

import lombok.Data;

import java.util.Date;

@Data
public class EmployeeDto {
    private String lastName;
    private String firstName;
    private String patronymic;
    private Date birthDate;
    private String position;
    private String shop;
    private Boolean gender;
}
