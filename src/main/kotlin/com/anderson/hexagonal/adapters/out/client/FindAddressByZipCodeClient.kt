package com.anderson.hexagonal.adapters.out.client

import com.anderson.hexagonal.adapters.out.client.response.AddressResponse
import org.springframework.cloud.openfeign.FeignClient
import org.springframework.web.bind.annotation.GetMapping

@FeignClient(
    name = "FindAddressByZipCodeClient",
    url = "\${anderson.client.address.url}"
)
interface FindAddressByZipCodeClient {

    @GetMapping("/{zipCode}")
    fun find(zipCode: String): AddressResponse
}