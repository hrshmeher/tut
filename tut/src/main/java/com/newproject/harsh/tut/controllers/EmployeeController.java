package com.newproject.harsh.tut.controllers;


import java.time.LocalDate;


import org.springframework.web.bind.annotation.RestController;

import com.newproject.harsh.tut.dto.EmployeeDTO;
import com.newproject.harsh.tut.services.employeeService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;




//operations 

// Get // employee
// post // employee
// delete / employee

@RestController
public class EmployeeController {

    @GetMapping(path = "/employees/{id}")
    public EmployeeDTO getemployeeDto(@PathVariable("id") Long employeeId){
        return new EmployeeDTO(employeeId, "Bunty",LocalDate.of(2023,06,07), true );
    }

    }



