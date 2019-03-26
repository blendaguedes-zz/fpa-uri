package lista_05

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    while (input.hasNextInt()) {
        val x = input.nextInt()
        x.let { intValor ->
            if (intValor == 1) {
                println("Nada")
            } else {
                if (isPrimo(intValor)) {
                    if (isSuper(intValor)) {
                        println("Super")
                    } else {
                        println("Primo")
                    }
                } else {
                    println("Nada")
                }
            }
        }
    }
}

fun isPrimo(intValor: Int): Boolean{
    var primo = true
    for (i in 2..(intValor - 2)) {
        if (intValor % i == 0) {
            primo = false
            break
        }
    }
    return primo
}

fun isSuper(intValor: Int): Boolean{
    val splitValor = intValor.toString().split("")
    var superPrimo = true
    for (i in splitValor) {
        if (i != "") {
            i.toInt().let { number ->
                if (number == 1 || number == 0) {
                    superPrimo = false
                } else {
                    if(!isPrimo(number)){
                        superPrimo = false
                    }
                }
            }
        }
    }
    return superPrimo
}