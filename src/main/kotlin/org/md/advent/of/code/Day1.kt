package org.md.advent.of.code

class Day1 {
    fun part1(items: IntArray): Int {
        var result = 0
        for (itemIndex in 1..items.lastIndex) {
            if (items[itemIndex] > items[itemIndex - 1]) {
                result++
            }
        }
        return result
    }

    fun part2(items: IntArray): Int {
        var result = 0
        val windowedItems = items.toList().windowed(3, partialWindows = true)
        var previousSum = windowedItems.first().sum()
        for (item in 1..windowedItems.lastIndex) {
            if (windowedItems[item].size != 3) break
            val currentSum = windowedItems[item].sum()
            if (currentSum > previousSum) {
                result++
            }
            previousSum = currentSum
        }
        return result
    }
}

fun main() {
    val day1 = Day1()
    val part1Result = day1.part1(day1Input)
    val part2Result = day1.part2(day1Input)
    println(part1Result)
    println(part2Result)
}