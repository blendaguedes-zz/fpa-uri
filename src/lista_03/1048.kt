package lista_03

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val salario = input.nextDouble()

    val reajuste = when {
        salario > 2000 -> 4
        salario > 1200 -> 7
        salario > 800 -> 10
        salario > 400 -> 12
        else -> 15
    }

    val novoSalario = salario * (1 + reajuste/100.0)

    println("Novo salario: ${"%.2f".format(novoSalario)}")
    println("Reajuste ganho: ${"%.2f".format(salario * reajuste/100.0)}")
    println("Em percentual: $reajuste %")
}