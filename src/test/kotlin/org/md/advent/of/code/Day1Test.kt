package org.md.advent.of.code

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class Day1Test {
    private lateinit var day1: Day1

    @Before
    fun setUp() {
        day1 = Day1()
    }

    @Test
    fun part1Test() {
        val input = intArrayOf(199, 200, 208, 210, 200, 207, 240, 269, 260, 263)

        val result = day1.part1(input)

        assertEquals(7, result)
    }

    @Test
    fun part2Test() {
        val input = intArrayOf(199, 200, 208, 210, 200, 207, 240, 269, 260, 263)

        val result = day1.part2(input)

        assertEquals(5, result)
    }
}