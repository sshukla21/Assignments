package fizzbuzz;

public class FizzBuzz {
    public static final String FIZZ = "Fizz";

    public String run(int number) {
        if (isMultipleOfThree(number)) {
            return FIZZ;
        }
        return String.valueOf(number);
    }

    private boolean isMultipleOfThree(int number) {
        return number % 3 == 0;
    }
}
