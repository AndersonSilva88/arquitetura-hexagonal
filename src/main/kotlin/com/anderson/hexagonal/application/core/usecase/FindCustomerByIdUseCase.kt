package com.anderson.hexagonal.application.core.usecase

import com.anderson.hexagonal.application.core.domain.Customer
import com.anderson.hexagonal.application.core.exceptions.ObjectNotFoundException
import com.anderson.hexagonal.application.ports.`in`.FindCustomerByIdInputPort
import com.anderson.hexagonal.application.ports.out.FindCustomerByIdOutputPort

class FindCustomerByIdUseCase(
    private val findCustomerByIdOutputPort: FindCustomerByIdOutputPort
): FindCustomerByIdInputPort {

    override fun find(id: String): Customer {
        return findCustomerByIdOutputPort.find(id) ?: throw ObjectNotFoundException("Customer not found")
    }
}