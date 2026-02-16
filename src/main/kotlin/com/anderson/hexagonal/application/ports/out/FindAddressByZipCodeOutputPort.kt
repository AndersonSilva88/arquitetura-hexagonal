package com.anderson.hexagonal.application.ports.out

import com.anderson.hexagonal.application.core.domain.Address

interface FindAddressByZipCodeOutputPort {

    fun find(zipCode: String): Address?
}