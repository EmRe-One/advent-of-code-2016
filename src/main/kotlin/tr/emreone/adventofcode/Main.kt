package tr.emreone.adventofcode

import tr.emreone.adventofcode.days.*
import tr.emreone.kotlin_utils.FileLoader
import tr.emreone.kotlin_utils.Logger.logger

fun main() {

    val day = 1

    logger.info { "Day $day: " }

    when (day) {
        1 -> solveDay1()
// $1
        else -> {
            throw IllegalArgumentException("Day $day is not implemented yet.")
        }
    }

}

fun solveDay1() {
    val input = FileLoader.readLines(filename = "day1.txt")[0].split(",")
    input.forEach { it.trim() }

    val solution1 = Day1.part1(input)
    logger.info {"Solution1: $solution1" }

    val solution2 = Day1.part2(input)
    logger.info {"Solution2: $solution2" }
}

// $2
