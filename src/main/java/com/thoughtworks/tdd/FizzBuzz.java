package com.thoughtworks.tdd;

class FizzBuzz {

    String fizzBuzz(int number) {
        if(shouldNotFizzBuzzWhizz(number)){
            return String.valueOf(number);
        }

        String result = "";
        if (shouldFizz(number)) {
            result += "Fizz";
        }

        if (shouldBuzz(number)) {
            result += "Buzz";
        }

        if (shouldWhizz(number)) {
            result += "Whizz";
        }

        return result;
    }

    private boolean shouldNotFizzBuzzWhizz(int number) {
        return !shouldFizz(number) && !shouldBuzz(number) && !shouldWhizz(number);
    }

    private boolean shouldWhizz(int number) {
        return number % 7 == 0;
    }

    private boolean shouldBuzz(int number) {
        return number % 5 == 0;
    }

    private boolean shouldFizz(int number) {
        return number % 3 == 0;
    }
}
