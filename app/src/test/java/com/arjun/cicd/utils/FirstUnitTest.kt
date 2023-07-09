package com.arjun.cicd.utils

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized
import org.junit.runners.Parameterized.Parameters

@RunWith(value = Parameterized::class)
class FirstUnitTest(private val inputStr: String, private val actualReturnValue: Boolean) {
    private lateinit var firstUnitInstance: FirstUnit

    init {
        JUnitCustomLog.e("inside JUnitCustomLog.kt"," New Instance is created")
    }

    @Before
    fun setUpTesting() {
        firstUnitInstance = FirstUnit()
    }

    @Test
    fun isPalindrome() {
        assertEquals(firstUnitInstance.isPalindrome(inputStr), actualReturnValue)
    }

    companion object {
        @JvmStatic
        @Parameters(name = "{0} is a palindrome expected {1}")
        fun testData(): List<Array<Any>> {
            return listOf(
                arrayOf("Hello", false),
                arrayOf("AbccbA", true),
                arrayOf("Abccba", true),
                arrayOf("xxxx", true),
                arrayOf("", true)
            )
        }
    }
}