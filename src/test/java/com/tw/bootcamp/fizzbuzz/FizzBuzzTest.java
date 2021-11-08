package com.tw.bootcamp.fizzbuzz;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void shouldBeOneWhenNumberIsOne() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("1", fizzBuzz.run(1));
    }

    @Test
    void shouldBeTwoWhenNumberIsTwo() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("2", fizzBuzz.run(2));
    }

    @Nested
    class MultipleOfThree {
        @Test
        void shouldBeFizzWhenNumberIsThree() {
            FizzBuzz fizzBuzz = new FizzBuzz();
            assertEquals("Fizz", fizzBuzz.run(3));
        }

        @Test
        void shouldBeFizzWhenNumberIsSix() {
            FizzBuzz fizzBuzz = new FizzBuzz();
            assertEquals("Fizz", fizzBuzz.run(6));
        }
    }

    //one assertion per test
    @Test
    void shouldBeBuzzWhenMultipleOfFive() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals("Buzz", fizzBuzz.run(10));
        assertEquals("Buzz", fizzBuzz.run(5));
    }
}
