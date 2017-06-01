/**
 * Created by dp on 2017/5/31.
 */

fun main(args: Array<String>) {
    println("Hello!")
    printSum(1, 2)
}

// Unit 返回类型可以省略：
// 字符串模板
fun printSum(a: Int, b: Int): Unit {
    println("$a + $b = ${a + b}")
}

