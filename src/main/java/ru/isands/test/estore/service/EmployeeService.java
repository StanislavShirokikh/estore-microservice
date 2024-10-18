package ru.isands.test.estore.service;

import org.springframework.stereotype.Service;
import ru.isands.test.estore.dto.EmployeeDto;

@Service
public interface EmployeeService {
    EmployeeDto createEmployeeDto(EmployeeDto employeeDto);
}
