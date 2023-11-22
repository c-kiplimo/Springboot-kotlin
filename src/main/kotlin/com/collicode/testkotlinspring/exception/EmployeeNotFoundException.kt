package com.collicode.testkotlinspring.exception

import org.springframework.http.HttpStatus


class EmployeeNotFoundException(status: HttpStatus, message: String) : RuntimeException(message) {
    val status: HttpStatus = status
}


