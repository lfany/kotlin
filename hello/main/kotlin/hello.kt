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
}

// Unit 返回类型可以省略：
// 字符串模板
fun printSum(a: Int, b: Int): Unit {
    println("$a + $b = ${a + b}")
}


// https://www.kotlincn.net/docs/reference/idioms.html
// 创建 DTOs（POJOs/POCOs） 函数的默认参数
data class Data(val name: String = "xxx", var email: String = "xxx@xxx.com")

