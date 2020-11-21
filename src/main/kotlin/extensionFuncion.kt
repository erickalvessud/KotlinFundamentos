fun main() {
    var nome = "João      da     Silva"
    //replaceMultipleWhiteSpace(nome)
    nome = nome.replaceMultipleWhiteSpaceEx()
    println(nome)
}

fun replaceMultipleWhiteSpace(s: String): String {
    var regex = Regex("\\s+")
    return regex.replace(s, " ")
}

fun String.replaceMultipleWhiteSpaceEx(): String {
    var regex = Regex("\\s+")
    return regex.replace(this, " ")
}
