fun main() {
    var program = Program()
    program.fibonacci(8, object: Process{
        override fun execute(value: Int) {
            println("Valores $value")
        }
    })
}

interface Process{
    fun execute(value: Int)
}

class Program {
    fun fibonacci(limit: Int, process: Process){
        var prev = 0
        var prevprev = 0
        var current = 1

        for (i: Int in 1..limit){
            process.execute(current)

            var temp = current
            prevprev = prev
            prev = temp
            current = prev + prevprev
        }
    }
}