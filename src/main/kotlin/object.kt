fun main(args: Array<String>) {
    val person = Person12345("D", 123)
    println(Person12345.newBaby("bbbb").age)

    // 인스턴스에 바로 접근 가능
    println(Singleton.a)
    Singleton.a += 10
    println(Singleton.a)

    // Movable 인터페이스를 구현하며 파라미터로 던져줌
    moveSomeThing(object : Movable {
        override fun fly() {
            TODO("Not yet implemented")
        }

        override fun move() {
            TODO("Not yet implemented")
        }
    })

}

class Person12345 (
    var name: String,
    var age: Int
        ){
    // static 사라짐. 대신 companion object 사용
    // 클래스와 동행하는 유일한 오브젝트
    companion object NAME : Log{
        private const val MIN_AGE = 1
        fun newBaby(name: String): Person12345{
            return Person12345(name, MIN_AGE)
        }

        override fun log() {
            TODO("Not yet implemented")
        }
    }
}

interface Log {
    fun log()
}

// 싱글톤 객체 생성, object만 붙여주면 된다
object  Singleton {
    var a: Int = 0
}

// 익명 클래스
// 인터페이스
interface Movable {
    fun move()
    fun fly()
}

// 인터페이스 타입을 파라미터로 받는 함수
private fun moveSomeThing(movable: Movable){
    movable.move()
    movable.fly()
}