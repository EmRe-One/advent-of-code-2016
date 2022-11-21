package de.emreak.adventofcode.days

import org.junit.jupiter.api.Test
import tr.emreone.utils.FileLoader
import kotlin.test.assertEquals


internal class Day1Test {

    @Test
    fun part_1_first_example() {
        val input1 = "R2, L3".split(",")
        input1.forEach { it.trim() }
        assertEquals(5, Day1.part1(input1), "Day 1, Part 1 - 1st example should be 5.")
    }

    @Test
    fun part_1_second_example() {
        val input2 = "R2, R2, R2".split(",")
        input2.forEach { it.trim() }
        assertEquals(2, Day1.part1(input2), "Day 1, Part 1 - 2nd example should be 2.")
    }

    @Test
    fun part_1_third_example() {
        val input3 = "R5, L5, R5, R3".split(",")
        input3.forEach { it.trim() }
        assertEquals(12, Day1.part1(input3), "Day 1, Part 1 - 3rd example should be 12.")
    }

    @Test
    fun part2() {
        // same input
        val input = FileLoader.readLines("src/test/resources", "day1_example.txt")
        assertEquals(-1, Day1.part2(input), "Day 1, Part 2 should be xx.")
    }

}