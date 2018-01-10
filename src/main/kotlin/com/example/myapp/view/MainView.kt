package com.example.myapp.view

import com.example.myapp.app.Styles
import com.example.myapp.model.Customer
import com.example.myapp.service.CustomerListEvent
import com.example.myapp.service.CustomerListRequest
import tornadofx.*

class MainView : View("Hello TornadoFX") {
    override val root = vbox {
        label(title) {
            addClass(Styles.heading)
        }
        tableview<Customer> {
            column("Name", Customer::nameProperty)
            column("Age", Customer::ageProperty)

            subscribe<CustomerListEvent> { event ->
                items.setAll(event.customers)
                //alert(INFORMATION, "Event received!", event.customers.toString())
            }
        }
        button("Load customers").action {
            fire(CustomerListRequest)

        }
    }
}