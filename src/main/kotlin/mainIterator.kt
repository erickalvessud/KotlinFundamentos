import java.util.*

fun main() {
    testeLoopingComRangeString()
}

fun testeLoopingIterandoLista(){
    var numbers = listOf(1,2,3,4,5)

    for (n in numbers){
        println(n)
    }
}

fun testLoopingMapa(){
    var ages = TreeMap<String, Int>()
    ages["Maria"] = 31
    ages["Jose"] = 31
    ages["Joao"] = 50

    for ((nome, idade) in ages){
        println("$nome tem $idade")
    }
}

fun testeLoopingIterandoListaEIndex(){
    var numbers = listOf(1,2,3,4,5)

    for ((index, elemento) in numbers.withIndex()){
        println("$elemento no indice $index")
    }
}

fun testeLoopingComRangeString(){
    val range = 'a' .. 'z'

    for (letra in range){
        println(letra)
    }
}
