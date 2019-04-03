package lista_08

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val qtd = input.nextInt()
    val sum = 285
    var count = 0

    while(true){
        count++

        var matrix = Array(9) { IntArray(9) }
        for (i in 0..8){
            for(j in 0..8){
                matrix[i][j] = input.nextInt()
            }
        }

        var sl = Array(9){0}
        var sc = Array(9){0}
        var sm = Array(3) { IntArray(3){0} }

        for (i in 0..8){
            for(j in 0..8){
                var k = matrix[i][j]
                k *= k
                sl[i] += k
                sc[j] += k
                sm[i/3][j/3] += k

                if (i == 8 && sc[j] != sum) break
            }

            if (sl[i] != sum) break
        }

        var test = true

        for (i in 0..2){
            for (j in 0..2){
                if (sm[i][j] != sum) {
                    test = false
                }
            }
        }

        if(test){
            println("Instancia $count")
            println("SIM")
        }else{
            println("Instancia $count")
            println("NAO")
        }

        println()
        if(count == qtd){
            break
        }
    }
}