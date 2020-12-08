/**
 * Diferente do java, conseguimos modificar atributos que estao fora do escopo do lambda
 * sem que esse atributo seja final
 */
fun main() {
    var resultado = 0

    var listaNumeros = listOf(1, 2, 3 ,4, 5, 6, 7, 8, 9, 10)
    listaNumeros.forEach({num -> resultado += num})
    println(resultado)
}