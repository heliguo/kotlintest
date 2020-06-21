package com.example.kotlinmvvm

/**
 * @author lgh on 2020/6/21 17:09
 * @description open可被继承关键字
 */
abstract class Person(val name: String, val age: Int) {

   abstract fun doStudy(study: Study?)

   abstract fun a()

}