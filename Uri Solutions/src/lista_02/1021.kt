package lista_02

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val valor = input.nextDouble()
    val valorInt = valor.toInt()
    var temp = valorInt%100

    println("NOTAS: ")
    println("${valorInt/100} nota(s) de R$ 100.00")
    println("${temp/50} nota(s) de R$ 50.00")
    temp %= 50
    println("${temp/20} nota(s) de R$ 20.00")
    temp %= 20
    println("${temp/10} nota(s) de R$ 10.00")
    temp %= 10
    println("${temp/5} nota(s) de R$ 5.00")
    temp %= 5
    println("${temp/2} nota(s) de R$ 2.00")
    temp %= 2

    val moeda50 = (valor % 100 % 50 % 20 % 5 % 2 % 1 / .5).toInt()
    val moeda25 = (valor % 100 % 50 % 20 % 5 % 2 % 1 % .5 / .25).toInt()
    val moeda10 = (valor % 100 % 50 % 20 % 5 % 2 % 1 % .5 % .25 / .1).toInt()
    val moeda05 = (valor % 100 % 50 % 20 % 5 % 2 % 1 % .5 % .25 % .1 / .05).toInt()
    val moeda01 = (valor % 100 % 50 % 20 % 5 % 2 % 1 % .5 % .25 % .1 % .05 / .01).toInt()

    println("MOEDAS: ")
    println("${temp/1} moeda(s) de R$ 1.00")
    println("${moeda50} moeda(s) de R$ 0.50")
    println("${moeda25} moeda(s) de R$ 0.25")
    println("${moeda10} moeda(s) de R$ 0.10")
    println("${moeda05} moeda(s) de R$ 0.05")
    println("${moeda01} moeda(s) de R$ 0.01")
}