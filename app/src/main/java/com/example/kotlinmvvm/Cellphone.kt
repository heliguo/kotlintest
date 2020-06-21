package com.example.kotlinmvvm

/**
 * @author lgh on 2020/6/21 17:37
 * @description 数据类关键字 data
 * 数据类，默认实现了 hasCode()、equals()、toString()
 */
data class Cellphone(val name: String, val price: Double) {
}