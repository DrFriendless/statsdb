package com.drfriendless.statsdb

import java.io.FileReader
import java.util.*

/**
 * The config file which tells us about the database.
 */
class DBConfig(filename: String) {
    val prop = Properties()
    val driver: String by prop
    val dbUser: String by prop
    val dbPasswd: String by prop
    val dbURL: String by prop

    init {
        FileReader(filename).use {
            println(it)
            prop.load(it)
        }
    }
}