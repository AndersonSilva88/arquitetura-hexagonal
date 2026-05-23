package com.anderson.hexagonal.application.core.usecase

import com.anderson.hexagonal.application.ports.`in`.DeleteCustomerByIdInputPort
import com.anderson.hexagonal.application.ports.`in`.FindCustomerByIdInputPort
import com.anderson.hexagonal.application.ports.out.DeleteCustomerByIdOutPutPort

class DeleteCustomerByIdUseCase(
    private val findCustomerByIdInputPort: FindCustomerByIdInputPort,
    private val deleteCustomerOutPutPort: DeleteCustomerByIdOutPutPort
): DeleteCustomerByIdInputPort {

    override fun delete(id: String) {
        findCustomerByIdInputPort.find(id)
        deleteCustomerOutPutPort.delete(id)
    }
}