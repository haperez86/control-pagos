package com.escuelaconduccion.control_pagos.enrollment.repository;

import com.escuelaconduccion.control_pagos.enrollment.model.Enrollment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnrollmentRepository extends JpaRepository<Enrollment, Long>{
}
