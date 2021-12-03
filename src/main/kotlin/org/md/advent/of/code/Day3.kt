package org.md.advent.of.code

class Day3 {
    fun part1(items: Array<String>): UInt {
        val bitCount = items.first().length
        var gammaBits = ""
        for (i in 0 until bitCount) {
            var zeroCount = 0
            var oneCount = 0
            for (item in items) {
                if (item[i] == '0') {
                    zeroCount++
                } else {
                    oneCount++
                }
            }
            gammaBits += if (zeroCount > oneCount) {
                '0'
            } else {
                '1'
            }
        }

        return gammaBits.toUInt(2) * gammaBits.inv().toUInt(2)
    }

    fun part2(items: Array<String>): UInt {
        val bitCount = items.first().length
        var zeroCount = 0
        var oneCount = 0
        for (item in items) {
            if (item.first() == '0') {
                zeroCount++
            } else {
                oneCount++
            }
        }

        val oxygenItems = if (oneCount > zeroCount) {
            items.filter { it.first() == '1' }
        } else {
            items.filter { it.first() == '0' }
        }.toMutableList()

        val carbonItems = if (zeroCount > oneCount) {
            items.filter { it.first() == '1' }
        } else {
            items.filter { it.first() == '0' }
        }.toMutableList()


        var itemsCount = oxygenItems.size
        while (itemsCount != 1) {
            for (i in 1 until bitCount) {
                zeroCount = 0
                oneCount = 0
                for (item in oxygenItems) {
                    if (item[i] == '0') {
                        zeroCount++
                    } else {
                        oneCount++
                    }
                }
                if (oneCount > zeroCount) {
                    oxygenItems.removeAll { it[i] == '0' }
                } else if (zeroCount > oneCount) {
                    oxygenItems.removeAll { it[i] == '1' }
                } else {
                    oxygenItems.removeAll { it[i] == '0' }
                }
                if (oxygenItems.size == 1) break
            }
            itemsCount = oxygenItems.size
        }


        itemsCount = carbonItems.size
        while (itemsCount != 1) {
            for (i in 1 until bitCount) {
                zeroCount = 0
                oneCount = 0
                for (item in carbonItems) {
                    if (item[i] == '0') {
                        zeroCount++
                    } else {
                        oneCount++
                    }
                }
                if (oneCount < zeroCount) {
                    carbonItems.removeAll { it[i] == '0' }
                } else if (zeroCount < oneCount) {
                    carbonItems.removeAll { it[i] == '1' }
                } else {
                    carbonItems.removeAll { it[i] == '1' }
                }
                if (carbonItems.size == 1) break
            }
            itemsCount = carbonItems.size
        }

        return oxygenItems.first().toUInt(2) * carbonItems.first().toUInt(2)
    }

    /**
     * Inverses binary number
     * 01011  --> 10100
     */
    private fun String.inv(): String {
        return buildString {
            this@inv.forEach {
                if (it == '0') {
                    append('1')
                } else {
                    append('0')
                }
            }
        }
    }
}

fun main() {
    val day3 = Day3()
    val part1Result = day3.part1(day3Input)
    val part2Result = day3.part2(day3Input)
    println(part1Result)
    println(part2Result)
}