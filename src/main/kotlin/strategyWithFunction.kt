fun main() {
    var program = ProgramWithFunctionArg()
    program.fibonacci(8, funcao = {n -> println(n)})
    println()
    // outra forma de escrever
    program.fibonacci(5) {it -> println(it)}
    println()
    program.fibonacci(5) {println(it)}

    println()

    /**
     * Usando method reference, infere o tipo de parametro que precisa passar.
     * Como o método fibonacci deixa claro que recebe um int, logo,
     * o kotlin sabe que precisa passar um int como parametro para o println
     */
    program.fibonacci(1, ::println)
}

class ProgramWithFunctionArg {
    fun fibonacci(limit: Int, funcao: (Int) -> Unit){
        var prev = 0
        var prevprev = 0
        var current = 1

        for (i: Int in 1..limit){
            funcao(current)

            var temp = current
            prevprev = prev
            prev = temp
            current = prev + prevprev
        }
    }
}