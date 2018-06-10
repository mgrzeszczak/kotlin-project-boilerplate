package com.github.mgrzeszczak.kotlinprojectboilerplate

import com.github.mgrzeszczak.model.ExternalModel
import mu.KLogging

fun main(args: Array<String>) {
    println("hello world")
    WithLogger().logSomething()

    val externalModel = ExternalModel("name")
}

class WithLogger {
    companion object : KLogging()

    fun logSomething() {
        logger.info { "hello world" }
    }

}
