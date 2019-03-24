package lista_02

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val a = input.nextInt()
    val b = input.nextInt()

    val restoAB = a % b
    val restoBA = b % a

    if (restoAB == 0 || restoBA == 0){
        println("Sao Multiplos")
    } else {
        println("Nao sao Multiplos")
    }
}