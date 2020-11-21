import java.lang.NumberFormatException
import java.util.*

fun main(args: Array<String>) {
    val q: Question? = Question()

    q?.answer = null;
    q?.answer = "42"

    println("The answer to the question ${q?.question} is ${q?.answer}")

    val message = if (q?.answer == q?.correctAnswer){
        "You were correct"
    } else {
        "Try again"
    }

    val number:Int? = try {
        Integer.parseInt(q?.answer)
    } catch (e: NumberFormatException){
        null
    }

    println("Number is $number")
    println(message)
}

fun test() {

    fun lazyMethod(): String {
        println("lazyMethod called!")
        return "here";
    }

    val lazyVariable: String by lazy { lazyMethod() }
    println("lazy not called!")
    println(lazyVariable)
}

class Question {
    var answer: String? = ""
    val correctAnswer = "42"
    val question: String = "What is the answer to live, the universe and everything?"

    fun display(){
        println("You said $answer")
    }

    fun printResult(){
        when(answer){
            correctAnswer -> print("You were correct")
            else -> print("Try again")
        }
    }
}

private fun testePessoa() {
    var erick = Person("Erick")

    erick.display()

    erick.nome = "Erick Alves"

    erick.display()

    erick.displayWithLambda { nome -> println("Imprime nome com lambda gerada ${nome}") }

    erick.displayWithLambda { n -> printNome(n) }

    erick.displayWithLambda(::printNome)
}

fun printNome(nome: String){
    println("printNome() - Imprime nome com lambda ${nome}")
}