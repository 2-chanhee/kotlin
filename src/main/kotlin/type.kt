fun main(args: Array<String>) {
    val number1 = 3 // 불변 변수
    val number2: Long = number1.toLong() // type 캐스팅 필요

    val number3: Int? = 3
    val number4: Long = number3?.toLong() ?: 0L // nullable 변수 처리

    // 개행을 포함한 문자열 작성시 """ 사용, ${}로 변수 사용 가능, $만 사용해도 된다.
    val name = "이찬희"
    val longStr =  """ 
        123
        345
        456
        $name
    """.trimIndent()

    val str = "ABC"
    println(str[1]) // B
}

fun printAgeIfPerson(obj: Any) {
    // Any: 모든 객체의 최상위 타입
    // java: instanceof, kotiln: is
    if(obj is Person){
        println(obj.name) // 스마트 캐스트, if에서 type check가 이루어졌기 때문에 추론 가능
    }

    if(obj !is Person){
        println("no Person type")
    }
}

// nullable parameter, null을 포함한 Any: Any?
fun printAgeIfPersonNullable(obj: Any?){
    val person = obj as? Person // as? 사용해서 nullable 선언
    println(person?.name)
}