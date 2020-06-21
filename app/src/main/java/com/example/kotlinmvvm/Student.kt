package com.example.kotlinmvvm

/**
 * author:lgh on 2020/6/9 13:57
 * Student(var id: Int, var studentNumber: Int) 指带参构造方法
 */
class Student(var id: Int, var studentNumber: Int, name: String, age: Int) :
    Person(name, age), Study {

    /**
     * 次构造方法
     */
    constructor(name: String, age: Int) : this(0, 0, name, age) {
    }

    constructor(id: Int, name: String, age: Int) : this(id, 0, name, age) {
    }

    /**
     * 无参构造方法可以使用其他任意构造方法
     */
    constructor() : this("", 0) {

    }

    /**
     * 主构造方法中的函数体
     */
    init {
        println(id)
        println(studentNumber)
        Singleton.test()

        doStudy(object : Study {
            override fun doHomework() {
            }
        })
    }

    override fun doStudy(study: Study?) {

        //不为空调用
        study?.readBook()
        study?.doHomework()

        //该操作同上
        study?.let {
            it.readBook()
            it.doHomework()
        }

    }

    override fun a() {
    }

    override fun doHomework() {
    }


}