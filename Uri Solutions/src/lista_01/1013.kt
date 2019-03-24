package lista_01

import java.util.Scanner
import kotlin.math.abs

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val a = input.nextInt()
    val b = input.nextInt()
    val c = input.nextInt()

    var primeiro_maior = (a+b+ abs(a-b))/2
    var maior = c
    if(primeiro_maior > c){
        maior = primeiro_maior
    }

    println("$maior eh o maior")
}