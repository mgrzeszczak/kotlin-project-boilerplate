package com.github.mgrzeszczak.kotlinprojectboilerplate

import mu.KLogging

fun main(args : Array<String>) {
    println("hello world")
    WithLogger().logSomething()
}

class WithLogger {
    companion object: KLogging()

    fun logSomething() {
        logger.info { "hello world" }
    }

}
