package com.company

class CustomArray(val array: Array<Int>) {
    operator fun plus(plusArray: CustomArray) = CustomArray(arrayOf(*array, *plusArray.array))
}

fun main() {
    val array1 = CustomArray(arrayOf(1, 2, 3))
    val array2 = CustomArray(arrayOf(10, 20, 30))
    val result = array1 + array2
    println(result.array.contentToString())
}