package org.tablekiosk.core

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class TableKioskCoreApplication

fun main(args: Array<String>) {
    runApplication<TableKioskCoreApplication>(*args)
}
