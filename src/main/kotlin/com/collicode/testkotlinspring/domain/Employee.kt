package com.collicode.testkotlinspring.domain

import jakarta.persistence.*
import java.time.LocalDate

@Entity
@Table(name = "employee")
data class Employee (
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?,
    @Column(name = "user_name", unique = true, nullable = false)
    val userName: String,
    @Column(name = "first_name", nullable = false)
    val firstName: String,
    @Column(name = "middle_name", nullable = true)
    val middleName: String?,
    @Column(name = "last_name", nullable = false)
    val lastName: String,
    @Column(name = "email_address", nullable = false)
    val emailId: String,
    @Column(name = "day_of_birth", nullable = false)
    val dayOfBirth: LocalDate
)