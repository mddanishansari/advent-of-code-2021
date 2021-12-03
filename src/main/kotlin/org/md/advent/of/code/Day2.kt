package org.md.advent.of.code

class Day2 {
    fun part1(items: Array<String>): Int {
        var position = 0
        var depth = 0

        for (item in items) {
            val value = item.last().digitToInt()
            when (item.first()) {
                'f' -> position += value
                'd' -> depth += value
                'u' -> depth -= value
            }
        }
        return position * depth
    }

    fun part2(items: Array<String>): Int {
        var position = 0
        var depth = 0
        var aim = 0

        for (item in items) {
            val value = item.last().digitToInt()
            when (item.first()) {
                'f' -> {
                    position += value
                    if (aim != 0) {
                        depth += (value * aim)
                    }
                }
                'd' -> aim += value
                'u' -> aim -= value
            }
        }

        return position * depth
    }
}

fun main() {
    val day2 = Day2()
    val part1Result = day2.part1(day2Input)
    val part2Result = day2.part2(day2Input)
    println(part1Result)
    println(part2Result)
}