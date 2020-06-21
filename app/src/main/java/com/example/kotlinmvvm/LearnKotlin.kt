package com.example.kotlinmvvm

import java.lang.Math.max
import java.util.*
import kotlin.collections.HashMap

/**
 * @author lgh on 2020/6/21 10:56
 * @description
 */

fun add(param1: Int, param2: Int) {
    println(param1 + param2)
}

fun maxOne(param1: Int, param2: Int): Int {
    return max(param1, param2)
}

/**
 *语法糖 方法体只有一行代码可直接赋值，还可忽略返回类型
 */
fun large(param1: Int, param2: Int): Int = max(param1, param2)

fun large1(param1: Int, param2: Int) = max(param1, param2)

/**
 * if 条件语句 同 Java if 但语法简洁
 */
fun large2(param1: Int, param2: Int): Int {
    var value = 0
    if (param1 > param2) {
        value = param1
    } else {
        value = param2
    }
    return value
}

/**
 * if 条件语句 简化版 1
 */
fun large21(param1: Int, param2: Int): Int {
    val value = if (param1 > param2) {
        param1
    } else {
        param2
    }
    return value
}

/**
 * if 条件语句 简化版 2
 */
fun large22(param1: Int, param2: Int): Int {
    return if (param1 > param2) {
        param1
    } else {
        param2
    }
}

/**
 * if 条件语句 简化版 3
 */
fun large23(param1: Int, param2: Int) = if (param1 > param2) param1 else param2


/**
 * when 条件语句 类似 Java switch
 */
fun getScore(name: String) = when (name) {
    "Tom" -> 86
    "Jim" -> 100
    else -> 0
}

/**
 * when 条件语句 不带参及特殊用法
 */
fun getScore1(name: String) = when {
    name.startsWith("Tome") -> 99
    name == "Tom" -> 86
    name == "Jim" -> 100
    else -> 0
}

/**
 * when 条件语句 类似 Java switch
 */
fun checkNumber(num: Number) = when (num) {
    is Int -> println("it is int")
    is Long -> println("it is long")
    else -> println("number not support")
}

/**
 * [0,10]
 */
val range = 0..10

/**
 * [0,10)
 */
val r = 0 until 10

/**
 * for in 循环 0..10 表示 [0,10]
 * i++ 步长为1
 */
fun forin() {
    for (i in 0..10) {
        println(i)
    }
}

/**
 * for in 循环 0..10 表示 [0,10)
 * i+2 步长为2
 */
fun forin1() {
    for (i in 0 until 10 step 2) {
        println(i)
    }
}

/**
 * 降序[10,1]
 * 步长为2
 */
fun fordown() {
    for (i in 10 downTo 1 step 2) {
        println(i)
    }
}

/**
 * 集合类 list set map
 */
fun listTest() {
    //不可变集合
    val list = listOf("aa", "bbb", "cccc")//只可读，不可增删改

//    val list1 = listOf<String>("a", "b", 1)//如果不加类型限定则各种类型可添加

    //可变list
    val list2 = mutableListOf("a", "b", "c", 1)
    list2.add("d")
    list2.add(3)

    val set = mutableSetOf("a", "b", "c")

    val map = HashMap<String, Int>()
    map.put("a", 1)
    //更推荐
    map["b"] = 2

    val map1 = mutableMapOf("a" to 1, "b" to 2)
    val map2 = mapOf("a" to 1, "b" to 2)

    for (item in list2) {
        println(item)
    }

    //map for each
    for ((fruit, number) in map1) {
        println(fruit + number)
    }

    /**
     * 寻找 list 中字符最长的元素
     */
    var maxLength = ""
    for (s in list) {
        if (s.length > maxLength.length) {
            maxLength = s
        }
    }
    println(maxLength)

    /**
     * lambda 表达式
     */
    var maxLength1 = list.maxBy { it.length }
    println(maxLength1)

    //参数名：参数类型 ->函数体
    val lambda1 = { fruit: String -> fruit.length }
    var length1 = list.maxBy(lambda1)

    //简化1 不需要定义lamdba变量
    var length12 = list.maxBy({ fruit: String -> fruit.length })

    //简化2 当lambda作为函数的最后一个参数时，可将lambda体移到括号外
    var length13 = list.maxBy() { fruit: String -> fruit.length }

    //简化3 当lambda作为函数的唯一一个参数时，可将lambda体移到括号外，同时括号可以省略
    var length14 = list.maxBy { fruit: String -> fruit.length }

    //简化4 kotlin 类推导机制 可以忽略参数类型
    var length15 = list.maxBy { fruit -> fruit.length }

    //简化5 参数唯一时，可省略用it替换
    var length16 = list.maxBy { it.length }

    /**
     * 集合中map函数
     */
    val newList = list.map { it.toUpperCase() }
    val newList1 = list.filter { it.length < 6 }
        .map { it.toUpperCase() }
    //集合中是否存在满足要求的元素
    var anyResult = list.any { it.length < 7 }
    //集合中是否所有元素满足要求
    var allResult = list.all { it.length < 7 }

    /**
     * java 函数式API调用
     * 单 抽象方法接口 参数
     */
    Thread(object : Runnable {
        override fun run() {
            println(1)

        }
    }).start()

    Thread(Runnable {
        println(2)

    }).start()

    Thread({
        println(3)
    }).start()

    Thread {
        println(4)
    }.start()

    /**
     * 判空符 ?. 和 ?:
     * 先判空，如果为空则为0
     * 不为空返回text.length
     * 非空断言：!! 自己保证一定不为空
     */

    fun getLength(text: String?) = text?.length ?: 0

    fun getLength1(text: String?) = text!!.length//非空断言

    fun getLength2(text: String?) {

        var i = text?.let { it.length }
    }


}

fun main() {

    val name = "jam"

    println("hello kotlin")

    val a = 10
    println("a = " + a)

    val b: Int = 20

    println("b = " + b)
    add(a, b)

    println(maxOne(a, b))

    listTest()

    /**
     * 字符串内嵌
     */

    println("hello ${name}\nnice to meet you")
}