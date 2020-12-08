fun main() {
    log("Metodo chamado kotlin")
}

@JvmOverloads
fun log(s: String, i: Int = 1) {
    println(s + i)
}
