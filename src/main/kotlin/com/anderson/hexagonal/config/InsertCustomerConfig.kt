package com.anderson.hexagonal.config

import com.anderson.hexagonal.adapters.out.FindAddressByZipCodeAdapter
import com.anderson.hexagonal.adapters.out.InsertCustomerAdapter
import com.anderson.hexagonal.application.core.usecase.InsertCustomerUseCase
import com.anderson.hexagonal.application.ports.`in`.InsertCustomerInputPort
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class InsertCustomerConfig {

    @Bean
    fun insertCustomer(
        findAddressByZipCodeAdapter: FindAddressByZipCodeAdapter,
        insertCustomerAdapter: InsertCustomerAdapter
    ): InsertCustomerInputPort {
        return InsertCustomerUseCase(findAddressByZipCodeAdapter, insertCustomerAdapter)
    }
}