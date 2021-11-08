package fizzbuzz;

public class FizzBuzz {
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";

    public String run(int number) {
        if (isMultipleOfFive(number)) {
            return BUZZ;
        }
        if (isMultipleOfThree(number)) {
            return FIZZ;
        }
        return String.valueOf(number);
    }

    private boolean isMultipleOfFive(int number) {
        return number % 5 == 0;
    }

    private boolean isMultipleOfThree(int number) {
        return number % 3 == 0;
    }
}
