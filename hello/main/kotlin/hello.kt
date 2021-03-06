import java.io.File

/**
 * Created by dp on 2017/5/31.
 */

fun main(args: Array<String>) {
    println("Hello!")
    printSum(1, 2)

    val data = Data()
    data.email = "xx"
    println(data)

    val list = listOf(1, 1.0f, 1.0, "string", data)
    println(list)
    println("${list[1].javaClass} & ${list[2].javaClass}")

    println(list.filter { it is Int || it is Float || it is Double || it is String })
    println(list.filter { x -> x is Data })
    for (i in list) {
        println(
                when (i) {
                    is Int -> "$i is Int"
                    is Float -> "$i is Float"
                    is Double -> "$i is Double"
                    is String -> "$i is String"
                    is Data -> "$i is Data"
                    else -> "$i is Other"
                }
        )
    }

//    for (i in 0..10){
//        println(i)
//    }
//    for (i in 0..10 step 2){
//        println(i)
//    }
//    for (i in 10 downTo 2 step 3) {
//        println(i)
//    }

//    val map = mapOf("a" to 1, "b" to 2, "c" to 3)
//    println(map)

    println("aa".xxx())
    println(p.xxx())

    println(Resource.name)

    val files = File("Test").listFiles()

    println(files?.size)

    println(files?.size ?: "empty")
    println(arrayOfMinusOnes(11).asList())

    class Turtle {
        fun penDown() {}
        fun penUp() {}
        fun turn(degrees: Double) {}
        fun forward(pixels: Double) {}
    }

    val myTurtle = Turtle()
    with(myTurtle) {
        // 画一个 100 像素的正方形
        penDown()
        for (i in 1..4) {
            forward(100.0)
            turn(90.0)
        }
        penUp()
    }
}

fun arrayOfMinusOnes(size: Int): IntArray {
    return IntArray(size).apply { fill(-1) }
}


// Unit 返回类型可以省略：
// 字符串模板
fun printSum(a: Int, b: Int): Unit {
    println("$a + $b = ${a + b}")
}


// https://www.kotlincn.net/docs/reference/idioms.html
// 创建 DTOs（POJOs/POCOs） 函数的默认参数
data class Data(val name: String = "xxx", var email: String = "xxx@xxx.com")

val p: String by lazy {
    // 计算该字符串
    "aa"
}

fun String.xxx(str: String = "xxxxxxxxxxxx"): String {
    return str
}

// 创建单例
object Resource {
    val name = "Name"
}


