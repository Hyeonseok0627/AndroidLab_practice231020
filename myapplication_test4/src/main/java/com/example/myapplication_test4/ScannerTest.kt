package com.example.myapplication_test4

import java.util.Scanner


object ScannerTest {
    @JvmStatic
    fun main(args: Array<String>) {
        val scanner = Scanner(System.`in`)
        println("이름:")
        // 문자열 읽기.
        val name = scanner.nextLine()
        println("직업:")
        val job = scanner.nextLine()
        println("사번:")
        val num = scanner.nextInt()
        println(name)
        println(job)
        println(num)
    }
}