package com.anderson.hexagonal.application.ports.out

import com.anderson.hexagonal.application.core.domain.Customer

interface UpdateCustomerOutputPort {

    fun update(customer: Customer)
}