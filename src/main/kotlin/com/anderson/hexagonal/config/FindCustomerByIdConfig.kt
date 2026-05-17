package com.anderson.hexagonal.config

import com.anderson.hexagonal.adapters.out.FindCustomerByIdAdapter
import com.anderson.hexagonal.application.core.usecase.FindCustomerByIdUseCase
import com.anderson.hexagonal.application.ports.`in`.FindCustomerByIdInputPort
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class FindCustomerByIdConfig {

    @Bean
    fun findCustomerById(findCustomerByIdAdapter: FindCustomerByIdAdapter): FindCustomerByIdInputPort {
        return FindCustomerByIdUseCase(findCustomerByIdAdapter)
    }
}