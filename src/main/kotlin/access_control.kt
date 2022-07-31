fun main(args: Array<String>) {

}

// private constructor를 선언하려면 constructor 앞에 private 사용해야 함
class Car private constructor(
    // protected: 선언된 클래스 or 하위 클래스에서만 접근 가능
    internal val name: String, // internal: 같은 모듈에서만 접근 가능
    private var owner: String,
    _price: Int
){
    var price = _price
        private set // setter에만 private로 선언 가능
}