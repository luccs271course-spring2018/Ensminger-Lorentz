package hw;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
        int max = 0;

        System.out.print("Enter Max Number: ");
        max = reading.nextInt();
        if(max<= 0)
        {
            System.out.println("Invalid entry, number must be greater than or equal to 1");
        }

        fizzBuzz(max);
    }

    public static List<String> fizzBuzz(int n) {
        List<String> storage = new ArrayList<>();

        for (int i = 1; i < n + 1; i++) {
            if ((i % 3 == 0 && i % 5 == 0) && i != 0) {
                storage.add("fizz buzz");
            } else if ((i % 3 == 0) && i != 0)

            {
                storage.add("fizz");
            }
            else if ((i % 5 == 0) && i != 0)
			{
                storage.add("buzz");
            }
            else
			{
                storage.add(Integer.toString(i));
            }
            String output= storage.get(i-1);
			System.out.println(output);
        }
        return storage;
    }
}

