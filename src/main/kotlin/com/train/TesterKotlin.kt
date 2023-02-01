package com.train

fun main(args: Array<String>) {
    println("How many tickets do you want to buy:")
    val totalTicket = readLine()?.toInt()

    println("How many round-trip tickets do you want to buy?")
    val roundTripTickets = readLine()?.toInt()

    println("The following is your ticket details:")
    val conKotlin = ConductorKotlin(totalTicket, roundTripTickets)
    conKotlin.showTransactionDetail()
}

class ConductorKotlin(var totalTicket: Int?, var roundTripTicket: Int?, var singlePrice: Int = 1000) {

    fun showTransactionDetail() {
        val fullTicket = totalTicket!! - roundTripTicket!!
        val price = fullTicket * singlePrice + roundTripTicket!! * singlePrice * 2 * 0.9

        println(
            "Total Tickets:$totalTicket \n Round-trip:$roundTripTicket \n " +
                    "Total:${price.toInt()} \n"
        )

    }
}