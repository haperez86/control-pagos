package com.escuelaconduccion.control_pagos.student.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentListDTO {
    private Long id;
    private String document;
    private String fullName;
    private Boolean active;
}
