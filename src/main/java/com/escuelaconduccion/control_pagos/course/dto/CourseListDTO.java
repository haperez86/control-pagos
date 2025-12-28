package com.escuelaconduccion.control_pagos.course.dto;

import lombok.*;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CourseListDTO {
    private Long id;
    private String code;
    private BigDecimal price;
    private Boolean active;
}
