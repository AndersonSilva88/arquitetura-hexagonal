package com.anderson.hexagonal.application.core.usecase

import com.anderson.hexagonal.application.core.domain.Customer
import com.anderson.hexagonal.application.ports.`in`.InsertCustomerInputPort
import com.anderson.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort
import com.anderson.hexagonal.application.ports.out.InsertCustomerOutputPort

class InsertCustomerUseCase(
    private val findAddressByZipCodeOutputPort: FindAddressByZipCodeOutputPort,
    private val insertCustomerOutputPort: InsertCustomerOutputPort
): InsertCustomerInputPort {

    override fun insert(customer: Customer, zipCode: String) {
        customer.apply {
            address = findAddressByZipCodeOutputPort.find(zipCode)
        }.let {
            insertCustomerOutputPort.insert(it)
        }
    }
}