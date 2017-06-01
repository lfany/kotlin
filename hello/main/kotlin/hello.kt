/**
 * Created by dp on 2017/5/31.
 */

fun main(args: Array<String>) {
    println("Hello!")
    printSum(1, 2)

    val data = Data()
    data.email = "xx"
    println(data)
}

// Unit 返回类型可以省略：
// 字符串模板
fun printSum(a: Int, b: Int): Unit {
    println("$a + $b = ${a + b}")
}


// https://www.kotlincn.net/docs/reference/idioms.html
// 创建 DTOs（POJOs/POCOs） 函数的默认参数
data class Data(val name: String = "xxx", var email: String = "xxx@xxx.com")

