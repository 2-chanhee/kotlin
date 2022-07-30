import java.io.BufferedReader
import java.io.File
import java.io.FileReader

fun main(args: Array<String>) {
    println(parseIntOrThrow("1"))
    println(parseIntOrReturnNull("asdf"))
}


fun parseIntOrThrow(str: String): Int {
    try{
        return str.toInt()
    }catch(e: NumberFormatException){
        // IllegalArgumentException: 적합하지 않거나(illegal) 적절하지 못한(inappropriate) 인자를 메소드에 넘겨주었을 때 발생
        throw IllegalArgumentException("주어진 ${str}은 숫자가 아닙니다")
    }
}

fun parseIntOrReturnNull(str: String): Int? {
    return try{
        str.toInt()
    }catch(e: NumberFormatException){
        null
    }
}

// 코틀린에서는 모두 unchecked execption으로 분류되어 에러가 날 것이라는 것에 대한 명시를 해주지 않아도 된다
class FilePrinter {
    fun readFile() {
        val currentFile = File(".");
        val file = File(currentFile.absolutePath + "/a.txt")
        val reader = BufferedReader(FileReader(file))
        println(reader.readLine())
        reader.close()
    }
}

// try with resource. readFile 내부가 실행되면 알아서 종료된다 (코틀린에서는 try with resource가 사라짐)
class FilePrinter2 {
    fun readFile(path: String) {
        BufferedReader(FileReader(path)).use { reader -> println(reader.readLine()) }
    }
}


