class Person (name: String){
    val name = name
}
// 변수
fun main(args: Array<String>) {
    /**
     * var: 가변 변수 선언
     * val: 불변 변수 선언,
     */
    var num1: Long = 10L; // 타입추론이 자동으로 되나 선언해줘도 무방
    val num2 = 10;
//    var num3; // 타입 선언 필요함, This variable must either have a type annotation or be initialized

    num1 = 11; // var 선언, 재할당 가능

//    num2 = 123; // val 선언, 재할당 불가능

    println(num1 + num2);

    // nullable한 변수인 경우 Type뒤에 ?를 붙여준다.
    val nullableNumber1: Long? = 1_000L;
    println(nullableNumber1)

    // 객체의 인스턴스화, 코틀린에서는 new Person .. new를 사용하지 않음
    var person = Person(name = "chanhee")
    println(person.name)
}