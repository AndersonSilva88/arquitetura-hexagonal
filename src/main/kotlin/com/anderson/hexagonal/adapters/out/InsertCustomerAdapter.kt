package com.anderson.hexagonal.adapters.out

import com.anderson.hexagonal.adapters.out.repository.CustomerRepository
import com.anderson.hexagonal.adapters.out.repository.entity.CustomerEntity
import com.anderson.hexagonal.application.core.domain.Customer
import com.anderson.hexagonal.application.ports.out.InsertCustomerOutputPort
import org.springframework.stereotype.Component

@Component
class InsertCustomerAdapter(
    private val customerRepository : CustomerRepository
): InsertCustomerOutputPort {
    override fun insert(customer: Customer) {
        customerRepository.save(CustomerEntity(customer))
    }
}