fun main(args: Array<String>) {
    val person1 = PersonDto("ㅁㄴㅇㄹ", 12)
    val person2 = PersonDto("ㅁㄴㅇㄹ1", 121)

    println(person1 == person2)
    println(person1)
}

// data 키워드 사용: equals, hashCode, toString을 자동으로 만들어준다.
data class PersonDto(
    val name: String,
    val age: Int
    )

// enum 분기처리
fun handleCountry(country: Country){
    when (country){
        Country.KOREA -> TODO()
        Country.LOG -> TODO()
    }
}

// enum class: 추가적인 클래스를 상속받을 수 없음.
enum class Country(
    private val code: String
) {
    KOREA("KO"),
    LOG("LOG")
}

