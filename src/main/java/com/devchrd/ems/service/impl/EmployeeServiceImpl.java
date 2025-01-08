package com.devchrd.ems.service.impl;

import com.devchrd.ems.dto.EmployeeDto;
import com.devchrd.ems.entity.Employee;
import com.devchrd.ems.mapper.EmployeeMapper;
import com.devchrd.ems.repository.EmployeeRepository;
import com.devchrd.ems.service.EmployeeService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        log.info("Adding new employee");
        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);
        log.info("Employee successfully added");
        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }

    @Override
    public EmployeeDto getEmployeeById(Long employeeId) {
        return null;
    }
}
