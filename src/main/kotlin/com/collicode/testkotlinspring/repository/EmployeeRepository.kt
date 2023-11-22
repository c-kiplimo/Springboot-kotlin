package com.collicode.testkotlinspring.repository

import com.collicode.testkotlinspring.domain.Employee
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface EmployeeRepository : JpaRepository<Employee, Long> {
}