package lista_08

import java.util.Scanner

fun main(args: Array<String>) {

    val input = Scanner(System.`in`)

    while (true){

        var n = input.nextInt()
        var m = input.nextInt()

        if (n == 0 && m == 0) break
        input.nextLine()
        var lista = input.nextLine().split(" ")
        var listaAux = ArrayList<String>()
        var counter = 0

        for (i in 0..(lista.size - 1)){
            for( j in (i+1)..(lista.size - 1)){
                if(lista[i] == lista[j] && !listaAux.contains(lista[i])){
                    counter++
                    listaAux.add(lista[i])
                    break
                }
            }
        }

        println(counter);
    }
}