package com.train

fun main(args: Array<String>) {

    var endBuyFlowCode: Int? = 0

    while (endBuyFlowCode != -1) {
        println("How many tickets do you want to buy:")
        val totalTicket = readLine()?.toInt()

        println("How many round-trip tickets do you want to buy?")
        val roundTripTickets = readLine()?.toInt()

        println("The following is your ticket details:")
        val conKotlin = ConductorKotlin(totalTicket, roundTripTickets)
        conKotlin.showTransactionDetail()

        println("If you want to stop buying ticket , you can input number -1 or not:")
        endBuyFlowCode = readLine()?.toInt()
    }

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