import java.lang.*;

fun main(args: Array<String>) {
    // 1. safe call
    val str: String? = "123" // null이 들어갈 수 있는 type
//    str.length; // null이 들어갈 수 있기 때문에 error
//    str?.length // null이 아닌 경우에만 실행된다

    // 2. Elvis 연산자
    val str2: String? = "123"
    str?.length ?: 100 // 앞의 식이 null이면 뒤에 값으로 출력

    println(startsWithA1(null))
    println(startsWithA2(null))
    println(startsWithA3(null))
}

fun startsWithA1(str: String?): Boolean{
    return str?.startsWith("A") ?: throw IllegalArgumentException("null IllegalArgumentException")
}

fun startsWithA2(str: String?): Boolean? {
    return str?.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {
    return str?.startsWith("A") ?: false

}
