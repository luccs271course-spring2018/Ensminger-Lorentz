package hw;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        int max = 0;

        System.out.print("Enter Max Number: ");
        max = reading.nextInt();

        fizzBuzz(max);
    }

    public static String[] fizzBuzz(int n) {
        String[] storage = new String[n + 1];

        for (int i = 1; i <= n; i++) {
            if ((i % 3 == 0 && i % 5 == 0) && i != 0) {
                storage[i] = "Fizz Buzz";
            } else if ((i % 3 == 0) && i != 0)

            {
                storage[i] = "Fizz";
            } else if ((i % 5 == 0) && i != 0)

            {
                storage[i] = "Buzz";
            } else {
                storage[i] = Integer.toString(i);
            }

        }
        return storage;
    }
}

