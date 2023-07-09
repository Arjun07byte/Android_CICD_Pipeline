package com.arjun.cicd.utils

object JUnitCustomLog {
    fun e(tag: String, value: String) {
        println("$tag : $value")
    }
}