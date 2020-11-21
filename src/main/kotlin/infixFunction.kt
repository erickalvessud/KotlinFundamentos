fun main() {
    val h1 = Header("h1")
    val h2 = Header("h2")

    //val h3 = h1 + h2
    val h3 = h1 plus h2
    h3.display()
}

class Header(val name: String) {}

/*operator*/ infix fun Header.plus(other: Header): Header{
    return Header(this.name + other.name)
}

fun Header.display(){
    println(this.name)
}