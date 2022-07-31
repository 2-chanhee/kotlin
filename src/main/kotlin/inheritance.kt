fun main(args: Array<String>) {

}

// 추상 클래스
abstract class Animal (
    protected val species: String,
    protected open val legCount: Int // 하위 클래스에서 프로퍼티를 오버라이드 하게끔 하려면 open 키워드 사용
    )
{
    abstract fun move()
}

// Animal class를 상속받음 (콜론 사용)
// 상속 시 상위 클래스의 생성자를 호출해 줘야 함
class Cat(
    species: String
) : Animal(species, 4){
    // 추상 메소드 구현 시 override 필수 사용
    override fun move() {
        println("고양잇")
    }
}

class Penguin (
    species: String
) : Animal(species, 2), Swimmable, Flyable{

    private val wingCount: Int = 2;

    override fun move() {
        println("펭귓")
    }

    override val legCount: Int
        get() = super.legCount + this.wingCount

    // 중복되는 인터페이스 함수를 구현할 시 <> 내부에 인터페이스 타입을 선언
    override fun act() {
        super<Swimmable>.act()
        super<Flyable>.act()
    }

}




