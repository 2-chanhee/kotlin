fun main(args: Array<String>) {
    val person = Person2("chan", 100)
//    println(person.name) // 바로 가져오기 가능
//    person.age = 10
//    println(person.age)

    // 첫번째 부 생성자
//    val initPerson = Person22("chan2")
//    println(initPerson.age)

    // 두번째 부 생성자
    val initPerson2 = Person22()

//    println(initPerson2.isAdult)
    println(initPerson2.convertNameToUpperCase)
//    println(initPerson2.name)

//    val initPerson3 = Person22(age = 100)
//    println(initPerson3.isAdult)
}

// getter, setter는 자동으로 만들어준다. constructor 생략 가능
class Person2 constructor(name: String, age: Int){
    val name: String = name
    var age: Int = age
}

// 이런식으로 만들기도 가능, 클래스의 필드 선언과 생성자를 동시에 선언할 수 있다
class Person22 (val name: String = "chan", var age: Int = 1, name2: String = "chan2") {
    // init: 클래스가 초기화되는 시점에 호출된다 (검증로직 사용)
    init {
        if(age <= 0) throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
    }

    // custom getter (프로퍼티처럼 만들 수 있음)
    val isAdult: Boolean
        get() = this.age >= 20

//    // get 시 대문자로 변환하게끔 함
//    // 무한루프 이슈로 인해 name 말고 field 키워드를 사용(자기 자신을 가리킴, name을 가리킴), backing field라고 함
//    val name = name
//        get()  = field.uppercase()

    val convertNameToUpperCase: String
        get() = this.name.uppercase()

    // set 해줘야 하니 var 선언
    var name2 = name
        set(value) {
            field = value.uppercase()
        }

    // 생성자 추가 가능 this로 상위 생성자를 호출함
    // 위에 있는 생성자는 주 생성자(필수 존재)
    constructor(name: String): this(name, 1){
        println("1")
    }

    // 부생성자보단 default parameter 사용 ㄱ
    constructor(): this("llolo"){
        println("2")
    }
}

