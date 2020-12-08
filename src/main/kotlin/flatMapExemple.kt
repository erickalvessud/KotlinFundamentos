fun main() {
    val meetings = listOf(Meeting(1,"Planning"), Meeting(1, "Daily"))
    // map
    val listOfListPerson: List<List<Person>> = meetings
        .map { it -> it.people }
    //flatMap
    val persons: List<Person> = meetings
        .flatMap { it -> it.people }
}

