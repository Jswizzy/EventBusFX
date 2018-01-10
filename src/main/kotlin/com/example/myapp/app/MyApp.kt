package com.example.myapp.app

import com.example.myapp.controller.CustomerController
import com.example.myapp.view.MainView
import tornadofx.*

class MyApp: App(MainView::class, Styles::class) {
    init {
        // Eagerly load CustomerController so it can receive events
        find(CustomerController::class)
    }
}