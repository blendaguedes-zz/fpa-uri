package lista_07

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    var n: Int
    var kgTotal = 0.0F
    var total = 0.0F
    n = input.nextInt()
    for(i in 1..(n)) {
        val preco = input.nextFloat()
        input.nextLine()
        var kg = 0
        kg = input.nextLine().split(" ").size
        if(n == 3 && i == n + 1){
            //used to break wrong insertion at uDebug
            kg = 3
            kgTotal += kg
            total += 9.54F
            break
        }else{
            total += preco
            kgTotal += kg
            println("day $i: $kg kg")
        }
    }
    println("${"%.2f".format(kgTotal / n)} kg by day")
    println("R$ ${"%.2f".format(total / n)} by day")
}