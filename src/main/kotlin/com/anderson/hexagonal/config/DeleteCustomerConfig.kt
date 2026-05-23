package com.anderson.hexagonal.config

import com.anderson.hexagonal.adapters.out.DeleteCustomerByIdAdapter
import com.anderson.hexagonal.application.core.usecase.DeleteCustomerByIdUseCase
import com.anderson.hexagonal.application.core.usecase.FindCustomerByIdUseCase
import com.anderson.hexagonal.application.ports.`in`.DeleteCustomerByIdInputPort
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class DeleteCustomerConfig {

    @Bean
    fun deleteCustomer(
        findCustomerByIdUseCase: FindCustomerByIdUseCase,
        deleteCustomerByIdAdapter: DeleteCustomerByIdAdapter
    ): DeleteCustomerByIdInputPort {
        return DeleteCustomerByIdUseCase(findCustomerByIdUseCase, deleteCustomerByIdAdapter)
    }
}