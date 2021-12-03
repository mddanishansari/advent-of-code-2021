package org.md.advent.of.code

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class Day3Test {
    private lateinit var day3: Day3

    @Before
    fun setUp() {
        day3 = Day3()
    }

    @Test
    fun part1Test() {
        val input = arrayOf("00100","11110","10110","10111","10101","01111","00111","11100","10000","11001","00010","01010")

        val result = day3.part1(input)

        assertEquals(198.toUInt(), result)
    }

    @Test
    fun part2Test() {
        val input = arrayOf("00100","11110","10110","10111","10101","01111","00111","11100","10000","11001","00010","01010")

        val result = day3.part2(input)

        assertEquals(230.toUInt(), result)
    }
}