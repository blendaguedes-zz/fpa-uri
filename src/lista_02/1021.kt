package lista_02

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    var valor = input.nextFloat()
    valor += 0.001.toFloat()
    if(valor >= 0 && valor <= 1000000){
        val nota100 = valor.toInt() / 100
        var temp = valor.toInt() % 100
        val nota50 = temp/50
        temp %= 50
        val nota20 = temp/20
        temp %= 20
        val nota10 = temp/10
        temp %= 10
        val nota5 = temp/5
        temp %= 5
        val nota2 = temp/2
        temp %= 2

        val moeda1 = (temp/1.0).toInt()
        val moeda50 = (((((((valor % 100) % 50) % 20) % 5) % 2) % 1) / .5).toInt()
        val moeda25 = ((((((((valor % 100) % 50) % 20) % 5) % 2) % 1) % .5) / .25).toInt()
        val moeda10 = (((((((((valor % 100) % 50) % 20) % 5) % 2) % 1) % .5) % .25) / .1).toInt()
        val moeda05 = ((((((((((valor % 100) % 50) % 20) % 5) % 2) % 1) % .5) % .25) % .1) / .05).toInt()
        val moeda01 = (((((((((((valor % 100) % 50) % 20) % 5) % 2) % 1) % .5) % .25) % .1) % .05) / .01).toInt()

        println("NOTAS:")
        println("$nota100 nota(s) de R$ 100.00")
        println("$nota50 nota(s) de R$ 50.00")
        println("$nota20 nota(s) de R$ 20.00")
        println("$nota10 nota(s) de R$ 10.00")
        println("$nota5 nota(s) de R$ 5.00")
        println("$nota2 nota(s) de R$ 2.00")

        println("MOEDAS:")
        println("$moeda1 moeda(s) de R$ 1.00")
        println("$moeda50 moeda(s) de R$ 0.50")
        println("$moeda25 moeda(s) de R$ 0.25")
        println("$moeda10 moeda(s) de R$ 0.10")
        println("$moeda05 moeda(s) de R$ 0.05")
        println("$moeda01 moeda(s) de R$ 0.01")
    }
}