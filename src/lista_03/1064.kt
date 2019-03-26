package lista_03

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    var positivos = 0
    var soma = 0.0F

    for (i in 0..5) {
        val x = input.nextFloat()
        if (x > 0) {
            positivos += 1
            soma += x
        }
    }
    println("$positivos valores positivos")
    println("%.1f".format(soma/positivos))
}