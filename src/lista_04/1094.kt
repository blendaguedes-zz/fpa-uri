package lista_04

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val numTests = input.nextInt()

    var cobaiasCoelhos = 0
    var cobaiasRatos = 0
    var cobaiasSapos = 0

    for (i in 1..numTests) {
        val cobaias = input.nextInt()
        val type = input.next()
        when (type) {
            "C" -> cobaiasCoelhos += cobaias
            "R" -> cobaiasRatos += cobaias
            "S" -> cobaiasSapos += cobaias
        }
    }

    val cobaiasTotal = cobaiasCoelhos + cobaiasRatos + cobaiasSapos

    println("Total: $cobaiasTotal cobaias")
    println("Total de coelhos: $cobaiasCoelhos")
    println("Total de ratos: $cobaiasRatos")
    println("Total de sapos: $cobaiasSapos")
    println("Percentual de coelhos: ${"%.2f".format(cobaiasCoelhos/cobaiasTotal.toFloat()*100)} %")
    println("Percentual de ratos: ${"%.2f".format(cobaiasRatos/cobaiasTotal.toFloat()*100)} %")
    println("Percentual de sapos: ${"%.2f".format(cobaiasSapos/cobaiasTotal.toFloat()*100)} %")
}