package com.itsherman.firstapp

class Model {
    static belongsTo = [make: Make]

    static constraints = {
    }

    String name


    String toString() {
        name
    }
}
