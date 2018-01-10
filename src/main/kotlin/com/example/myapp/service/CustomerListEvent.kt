package com.example.myapp.service

import com.example.myapp.model.Customer
import tornadofx.*

class CustomerListEvent(val customers: List<Customer>): FXEvent()

