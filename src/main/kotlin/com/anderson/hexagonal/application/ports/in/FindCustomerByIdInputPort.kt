package com.anderson.hexagonal.application.ports.`in`

import com.anderson.hexagonal.application.core.domain.Customer

interface FindCustomerByIdInputPort {

    fun find(id: String): Customer
}