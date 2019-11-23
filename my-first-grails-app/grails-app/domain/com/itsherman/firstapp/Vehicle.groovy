package com.itsherman.firstapp

@SuppressWarnings("GrailsDomainReserveSqlKeywordName")
class Vehicle {

    static constraints = {
        year min: 1900
        name maxSize: 255
    }

    Integer year
    String name
    Make make
    Model model
}
