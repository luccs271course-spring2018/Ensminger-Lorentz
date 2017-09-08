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
        String[] storage = new String[n];

        for (int i = 1; i < n + 1; i++) {
            if ((i % 3 == 0 && i % 5 == 0) && i != 0) {
                storage[i-1] = "Fizz Buzz";
            } else if ((i % 3 == 0) && i != 0)

            {
                storage[i-1] = "fizz";
            }
            else if ((i % 5 == 0) && i != 0)
			{
                storage[i-1] = "buzz";
            }
            else
			{
                storage[i-1] = Integer.toString(i);
            }
			System.out.println(storage[i-1]);
        }
        System.out.print(storage);
        return storage;
    }
}

