package lista_07

import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    while(input.hasNext()){
        val qtdPares = input.nextInt()

        var pairs = ArrayList<Pair>()
        for(i in 0..(qtdPares - 1)){
            var create = false
            val size = input.nextInt()
            val direction = input.next()

            for (j in pairs){
                create = j.callIncrease(size, direction)
                if(create){
                    break
                }
            }

            if(!create){
                var p = Pair()
                p.set(size, direction)
                pairs.add(p)
            }
        }
        println(Pair.pairs)
        Pair.pairs = 0
    }
}

class Pair(
        private var left: String? = null,
        private var leftSize: Int = 0,
        private var right: String? = null,
        private var rightSize: Int = 0
){
    companion object {
        var pairs: Int = 0

        fun increase(){
            pairs += 1
        }
    }

    fun set(size: Int, direction: String){
        if(direction == "E") {
            this.left = direction
            this.leftSize = size
        }else {
            this.right = direction
            this.rightSize = size
        }
    }

    private fun setPair(size: Int, direction: String){
        if(direction == "E") {
            this.left = direction
            this.leftSize = size
            Pair.increase()
        }else {
            this.right = direction
            this.rightSize = size
            Pair.increase()
        }
    }

    fun callIncrease(size: Int, direction: String): Boolean{
        var result = false
        if(this.leftSize == size && direction == "D" && this.right == null){
            if(this.left != null || this.right != null){
                setPair(size, direction)
                result = true
            }
        }else if(this.rightSize == size && direction == "E" && this.left == null){
            if(this.left != null || this.right != null){
                setPair(size, direction)
                result = true
            }
        }
        return result
    }
}