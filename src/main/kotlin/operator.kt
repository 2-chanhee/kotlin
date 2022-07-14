class Money(money: Long){
    val money = money;
}

fun main(args: Array<String>) {
    val money1 = Money(1_000L)
    val money2 = money1;
    val money3 = Money(1_000L)

    println(money1.toString())

    println(money1 === money2) // 주소가 같은지 확인 === (true)
    println(money1 === money3) // 주소가 같은지 확인 === (false)
//    println(money1 == money3) // 값이 같은지 확인 == (내부적으로 equals 호출)

    // lazy 연산 (js 단축평가같은거)
    if(fun1() || fun2()){
        println("?") // fun1이 true기 때문에 fun1만 호출된다.
    }

}
fun fun1(): Boolean {
    println("true11111")
    return true
}

fun fun2(): Boolean{
    println("false22222")
    return false
}