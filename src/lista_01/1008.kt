package lista_01

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val funcId = input.nextInt()
    val funcHrsTrab = input.nextInt()
    val funcSalarioHr = input.nextDouble()

    val salario = funcHrsTrab * funcSalarioHr

    println("NUMBER = $funcId")
    println("SALARY = U\$ ${"%.2f".format(salario)}")
}