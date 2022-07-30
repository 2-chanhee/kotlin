fun main(args: Array<String>) {
    println(max(1,4))
    repeat("hi")
    printNameAndGender(name = "ㅇㅇ", gender = "MM") // named arguments
    printAll("A","B","C")

    val arr = arrayOf("A","b","c","D")
    printAll(*arr) // 배열을 넣을 때는 * 사용

}

// return 없이 = 으로 표현 가능
// = 을 사용하는 경우 반환 타입 생략 가능, {} 사용 시에는 명시적으로 타입 선언해 줘야 함
fun max(a: Int, b: Int) = if(a > b) a else b


// default parameter
// Unit Type은 생략 가능(void같은 느낌)
// default parameter를 선언할 시 함수 호출할 때 넘겨주지 않아도 된다. 그럼 기본값 사용함
fun repeat(str: String, num: Int = 3, useNewLine: Boolean = true){
    for(i in 1..num){
        if(useNewLine){
            println(str)
        }else{
            print(str)
        }
    }
}

// named arguments
fun printNameAndGender(name: String, gender: String){
    println(name)
    println(gender)
}

// 같은 타입의 여러 파라미터 받기 (가변인자)
fun printAll(vararg strings: String){
    for (str in strings){
        println(str)
    }
}