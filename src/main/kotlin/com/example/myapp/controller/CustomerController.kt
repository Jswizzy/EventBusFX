package com.example.myapp.controller

import com.example.myapp.model.Customer
import com.example.myapp.service.CustomerListEvent
import com.example.myapp.service.CustomerListRequest
import tornadofx.*

class CustomerController: Controller() {
    init {
        subscribe<CustomerListRequest> {
            val customers = loadCustomers()
            fire(CustomerListEvent(customers))
        }
    }

    private fun loadCustomers(): List<Customer> =
            listOf(
                    Customer("John", 30),
                    Customer("Bob", 26))
                    .observable()
}