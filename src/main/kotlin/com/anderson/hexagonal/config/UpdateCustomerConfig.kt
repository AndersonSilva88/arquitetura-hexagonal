package com.anderson.hexagonal.config

import com.anderson.hexagonal.adapters.out.FindAddressByZipCodeAdapter
import com.anderson.hexagonal.adapters.out.UpdateCustomerAdapter
import com.anderson.hexagonal.application.core.usecase.FindCustomerByIdUseCase
import com.anderson.hexagonal.application.core.usecase.UpdateCustomerUseCase
import com.anderson.hexagonal.application.ports.`in`.UpdateCustomerInputPort
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class UpdateCustomerConfig {

    @Bean
    fun updateCustomer(
        findCustomerByIdUseCase: FindCustomerByIdUseCase,
        findAddressByZipCodeAdapter: FindAddressByZipCodeAdapter,
        updateCustomerAdapter: UpdateCustomerAdapter
    ): UpdateCustomerInputPort {
        return UpdateCustomerUseCase(
            findCustomerByIdUseCase,
            findAddressByZipCodeAdapter,
            updateCustomerAdapter
        )
    }
}