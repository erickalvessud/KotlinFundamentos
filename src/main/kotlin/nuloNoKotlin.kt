fun main() {
    var meeting1: Meeting? = Meeting(1, "lean planning")
    var meeting2: Meeting = meeting1 ?: Meeting(99, "Reuniao Padrao")

    var email : String? = "email"
    email?.let { email -> sendEmailTo(email) }
}
fun sendEmailTo(email : String){
    //envia o email...
}



fun strLenSafe(s: String?): Int =
    s?.length ?: 0

class Address(val streetAddress: String, val zipCode: Int,
              val city: String, val country: String)
class Company(val name: String, val address: Address?)
class Persona(val name: String, val company: Company?)

fun Persona.countryName(): String {
    val country = this.company?.address?.country
    return country ?: "Unknown"
}


