fun main(args: Array<String>) {
    // 컬렉션 생성
    val numbers = listOf(1L, 2L, 3L)

    // in 뒤는 iterable이 구현된 타입이면 모두 들어갈 수 있음
    for(number in numbers){
        println(number)
    }

    // 코틀린에서의 for문
    // 1..3 : 1~3
    for(i in 1..3){
        println(i)
    }

    // 3부터 1까지 내려가면서 print
    for(i in 3 downTo 1){
        println(i)
    }

    // i를 2씩 증가시킨다
    for(i in 1..5 step 2){
        println(i)
    }
}