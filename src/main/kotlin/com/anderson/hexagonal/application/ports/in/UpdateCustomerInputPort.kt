package com.anderson.hexagonal.application.ports.`in`

import com.anderson.hexagonal.application.core.domain.Customer

interface UpdateCustomerInputPort {

    fun update(customer: Customer, zipCode: String)
}