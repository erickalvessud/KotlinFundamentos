class Reuniao(val nome: String, val localidade: String)
// kotlin cria o eaquals, hashcode, toString e copy (para fazer clones do objeto)
data class ReuniaoData(val nome: String, val localidade: String)

fun main() {
    val daily = Reuniao("Reunião de daily", "SP")
    val plainning = Reuniao("Reunião de daily", "SP")

    // compara referencias
    if(daily == plainning)
        println("Iguais")
    else
        println("diferentes")

    val oneAOne = ReuniaoData("Reunião One a One", "SP")
    val oneAOne2 = ReuniaoData("Reunião One a One", "SP")

    // compara iguals da data class
    if(oneAOne == oneAOne2)
        println("Iguais")
    else
        println("diferentes")
}
