package com.itsherman.firstapp

class HomeController {

    def index() {
        respond([name: session.name ?: 'User', vehicleTotal: Vehicle.count(), vehicles: Vehicle.list()])
    }

    def updateName(String name) {
        session.name = name
        flash.message = "Name has been updated"
        redirect action: 'index'
    }
}
