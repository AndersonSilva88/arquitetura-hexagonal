package com.anderson.hexagonal.application.ports.out

import com.anderson.hexagonal.application.core.domain.Customer

interface FindCustomerByIdOutputPort {

    fun find(id: String): Customer?
}