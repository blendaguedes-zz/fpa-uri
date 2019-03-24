package lista_02

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val valor = input.nextInt()

    println("$valor")

    print("${valor/100} nota(s) de R$ 100,00\n")
    var temp = valor%100

    print("${temp/50} nota(s) de R$ 50,00\n")
    temp %= 50

    print("${temp/20} nota(s) de R$ 20,00\n")
    temp %= 20

    print("${temp/10} nota(s) de R$ 10,00\n")
    temp %= 10

    print("${temp/5} nota(s) de R$ 5,00\n")
    temp %= 5

    print("${temp/2} nota(s) de R$ 2,00\n")
    temp %= 2

    print("${temp/1} nota(s) de R$ 1,00\n")
}