fun main() {
    log("Metodo chamadado kotlin")
}

@JvmOverloads
fun log(s: String, i: Int = 1) {
    println(s + i)
}
