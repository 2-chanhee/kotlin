fun main(args: Array<String>) {
    println(getGradeWithWhen(81, type = "f"))

    println(judgeNumber(1))
}

// if
fun validateScoreIsNotNegative(score: Int){
    if (score < 0){
        throw IllegalArgumentException("${score}는 0보다 작을 수 없습니다")
    }

    // 특점 범위에 포함되어 있지 않은지.. 검사 (in 문법 사용)
    if(score !in 0..100){
        throw  java.lang.IllegalArgumentException("$score 범위 벗어남")
    }
}

// if else
fun getPassOrFail(score: Int): String{
    // as-is (java)
//    if (score >= 50) return "P"
//    else return "F"

    // to-be (if의 결과를 바로 return)
    return if (score >= 50) return "P"
    else return "F"
}

// if if-else else
fun getGrade(score: Int): String {
    // as-is (java)
//    if(score >= 90) {
//        return "A"
//    }else if (score >= 80){
//        return "B"
//    }else{
//        return "C"
//    }

    // to-be
    return if(score >= 90) {
        return "A"
    }else if (score >= 80){
        return "B"
    }else{
        return "C"
    }
}

// when (기존 switch) 코틀린에서 switch-case 사라짐
fun getGradeWithWhen(score: Int, type: String): String{
    return if(type == "A"){
        when(score / 10){
            9 -> "A"
            8 -> "B"
            7 -> "C"
            else -> "D"
        }
    }else {
        when(score){
            in 90..99 -> "D"
            in 80..89 -> "F"
            in 70..79 -> "P"
            else -> "Z"
        }
    }
}

// when 하나더
fun judgeNumber(number: Int){
    when(number){
        -1, 0, 1 -> println("이게 된다고 ㄷㄷ")
        else -> println("진짜네")
    }
}





