package com.thoughtworks.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    void should_return_original_number_when_number_none_3_or_5_7_times() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        Assertions.assertEquals("1", fizzBuzz.fizzBuzz(1));
    }

    @Test
    void should_return_fizz_when_number_is_3_times() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        Assertions.assertEquals("Fizz", fizzBuzz.fizzBuzz(3));
    }

    @Test
    void should_return_buzz_when_number_is_5_times() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        Assertions.assertEquals("Buzz", fizzBuzz.fizzBuzz(5));
    }

    @Test
    void should_return_whizz_when_number_is_5_times() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        Assertions.assertEquals("Whizz", fizzBuzz.fizzBuzz(7));
    }

    @Test
    void should_return_fizz_buzz_when_number_is_3_and_5_times() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        Assertions.assertEquals("FizzBuzz", fizzBuzz.fizzBuzz(15));
    }

    @Test
    void should_return_fizz_whizz_when_number_is_3_and_7_times() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        Assertions.assertEquals("FizzWhizz", fizzBuzz.fizzBuzz(21));
    }

    @Test
    void should_return_buzz_whizz_when_number_is_5_and_7_times() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        Assertions.assertEquals("BuzzWhizz", fizzBuzz.fizzBuzz(35));
    }

    @Test
    void should_return_fizz_buzz_whizz_when_number_is_3_and_5_and_7_times() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        Assertions.assertEquals("FizzBuzzWhizz", fizzBuzz.fizzBuzz(105));
    }
}
