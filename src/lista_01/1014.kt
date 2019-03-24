package lista_01

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val km = input.nextInt()
    val fuel = input.nextDouble()

    println("${"%.3f".format(km/fuel)} km/l")
}