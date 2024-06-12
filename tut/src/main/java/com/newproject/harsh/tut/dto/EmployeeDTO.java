package com.newproject.harsh.tut.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;

import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {

    private Long Id;

    private String name;

    private LocalDate dateofjoin;

    private boolean isActive;

}
