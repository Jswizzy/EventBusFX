package com.example.myapp.model

import javafx.beans.property.SimpleIntegerProperty
import javafx.beans.property.SimpleStringProperty
import tornadofx.*

class Customer(name: String, age: Int) {
    val nameProperty = SimpleStringProperty(name)
    var name by nameProperty

    val ageProperty = SimpleIntegerProperty(age)
    var age by ageProperty
}

class CustomerModel : ItemViewModel<Customer>() {
    val name = bind(Customer::nameProperty)
    val age = bind(Customer::ageProperty)
}


