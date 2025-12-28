package com.escuelaconduccion.control_pagos.payment.repository;

import com.escuelaconduccion.control_pagos.payment.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

    @Query("SELECT p FROM Payment p " +
            "JOIN FETCH p.paymentMethod " +
            "WHERE p.enrollment.id = :enrollmentId")
    List<Payment> findByEnrollmentIdWithMethod(@Param("enrollmentId") Long enrollmentId);
}