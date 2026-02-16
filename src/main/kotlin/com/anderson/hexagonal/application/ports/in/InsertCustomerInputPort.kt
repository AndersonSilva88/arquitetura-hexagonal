package com.anderson.hexagonal.application.ports.`in`

import com.anderson.hexagonal.application.core.domain.Customer

interface InsertCustomerInputPort {

    fun insert(customer: Customer, zopCode: String)
}