package lista_02

import java.util.Scanner
import kotlin.math.abs

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val a = input.nextFloat()
    val b = input.nextFloat()
    val c = input.nextFloat()

    var isTriangulo = false

    if ((abs(b - c) < a) && (a < (b + c))){
        if ((abs(a - c) < b) && (b < (a + c))){
            if ((abs(a - b) < c) && (c < (a + b))){
                isTriangulo = true
            }
        }
    }

    if (isTriangulo){
        val perimetro = a + b + c
        println("Perimetro = ${"%.1f".format(perimetro)}")
    } else {
        val area = ((a + b) * c) / 2
        println("Area = ${"%.1f".format(area)}")
    }
}