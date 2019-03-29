package lista_06

fun main(args: Array<String>) {
    var s = 0.0F

    for (i in 1..100) {
        s += 1/i.toFloat()
    }

    println("%.2f".format(s))
}