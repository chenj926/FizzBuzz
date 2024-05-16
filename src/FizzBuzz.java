/**
 * Solve the FizzBuzz challenge.
 */
import java.util.*;

class FizzBuzz {

    public static void main(String[] args) {
        boolean stop = false;
        int i = 1;

        while (!stop) {
            // Find out which numbers divide i.
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            // Print our appropriate result.
            if (divisibleBy3 && divisibleBy5) {
                System.out.println("Fizz Buzz");

            } else if (divisibleBy3) {
                System.out.println("Fizz");

            } else if (divisibleBy5) {
                System.out.println("Buzz");

            } else {
                System.out.println(i);

            }

            if (i > 100) {
                    stop = true;
            }
            i++;
            doFizzBuzz result = new doFizzBuzz(stop, i);
        }

        /*
        for (int i = 1; i < 100; i++) {
            // Find out which numbers divide i.
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            // Print our appropriate result.
            if (divisibleBy3 && divisibleBy5) {
                System.out.println("Fizz Buzz");

            } else if (divisibleBy3) {
                System.out.println("Fizz");

            } else if (divisibleBy5) {
                System.out.println("Buzz");

            } else {
                System.out.println(i);

            }
        }*/
    }

    private static class doFizzBuzz {
        public final boolean stop;
        public final int i;

        public doFizzBuzz(boolean stop, int i) {
            this.stop = stop;
            this.i = i;
        }
    }
}

