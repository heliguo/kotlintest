package com.example.kotlinmvvm

/**
 * @author lgh on 2020/6/21 17:23
 * @description 主构造方法无参，次构造方法有参
 * 父类()的含义为是否使用主构造方法
 */
class Student1 : Person,Study {

    constructor(name: String, age: Int) : super(name, age) {

    }

//    override fun readBook() {
//    }

    override fun doHomework() {
    }


    override fun doStudy(study: Study?) {
    }

    override fun a() {
    }


}