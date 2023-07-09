package com.arjun.cicd.utils

import android.util.Log

class FirstUnit {
    init {
        println("FirstUnit.kt New Instance is created")
    }

    fun isPalindrome(inputStr: String): Boolean {
        return inputStr.lowercase().reversed() == inputStr.lowercase()
    }
}