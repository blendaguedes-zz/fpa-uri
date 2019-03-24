package lista_01

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val a = input.nextDouble()
    val b = input.nextDouble()
    val media = ((a * 3.5) + (b * 7.5)) / (3.5 + 7.5)
    println("MEDIA = ${"%.5f".format(media)}")
}