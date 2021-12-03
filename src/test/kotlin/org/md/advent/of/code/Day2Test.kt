package org.md.advent.of.code

import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class Day2Test {
    private lateinit var day2: Day2

    @Before
    fun setUp() {
        day2 = Day2()
    }

    @Test
    fun part1Test() {
        val input = arrayOf("forward 5", "down 5", "forward 8", "up 3", "down 8", "forward 2")

        val result = day2.part1(input)

        assertEquals(150, result)
    }

    @Test
    fun part2Test() {
        val input = arrayOf("forward 5", "down 5", "forward 8", "up 3", "down 8", "forward 2")

        val result = day2.part2(input)

        assertEquals(900, result)
    }
}