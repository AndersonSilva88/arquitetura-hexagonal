package com.anderson.hexagonal.adapters.out

import com.anderson.hexagonal.adapters.out.repository.CustomerRepository
import com.anderson.hexagonal.adapters.out.repository.entity.CustomerEntity
import com.anderson.hexagonal.application.core.domain.Customer
import com.anderson.hexagonal.application.ports.out.UpdateCustomerOutputPort
import org.springframework.stereotype.Component

@Component
class UpdateCustomerAdapter(
    private val customerRepository: CustomerRepository
): UpdateCustomerOutputPort {

    override fun update(customer: Customer) {
        customerRepository.save(CustomerEntity(customer))
    }

}