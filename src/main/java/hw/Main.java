package hw;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        int max = 0;
        if (args.length > 0) {
            try {
                max = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.err.println("The argument entered must be an integer ");
                System.exit(1);
            }
        }

        //This is for part 2 comment out when done
        /*
        for (int i = 1; i < max + 1; i++) {
            if ((i % 3 == 0 && i % 5 == 0) && i != 0) {
                System.out.println("fizz buzz");
            } else if ((i % 3 == 0) && i != 0) {
                System.out.println("fizz");
            } else if ((i % 5 == 0) && i != 0) {
                System.out.println("buzz");
            } else {
               System.out.println((Integer.toString(i)));
            }
        }*/

        //This is for part 3 and 4 comment out for part 2
        //fizzBuzz(max);
    }


//This is part 4 comment out if not evaluating part 4

    public static List<String> fizzBuzz(int n) {
        List<String> storage = new ArrayList<>();
        String message = "The integer entered must be greater than or equal to 1";
        if (n > 0) {
            for (int i = 1; i < n + 1; i++) {
                if ((i % 3 == 0 && i % 5 == 0) && i != 0) {
                    storage.add("fizz buzz");
                } else if ((i % 3 == 0) && i != 0)

                {
                    storage.add("fizz");
                } else if ((i % 5 == 0) && i != 0) {
                    storage.add("buzz");
                } else {
                    storage.add(Integer.toString(i));
                }
                String output = storage.get(i - 1);
                System.out.println(output);
            }
            return storage;
        } else {
            storage.add(message);
            return storage;
        }

    }
}

//This is for Part 3 of the project comment out if not evaluating part 3
    /*
    public static String[] fizzBuzz(int n) {

        String[] message = {"The integer entered must be greater than or equal to 1"};
        if (n > 0) {
            String[] storage = new String[n];
            for (int i = 1; i < n + 1; i++) {
                if ((i % 3 == 0 && i % 5 == 0) && i != 0) {
                    storage[i - 1] = "fizz buzz";
                } else if ((i % 3 == 0) && i != 0) {
                    storage[i - 1] = "fizz";
                } else if ((i % 5 == 0) && i != 0) {
                    storage[i - 1] = "buzz";
                } else {
                    storage[i - 1] = (Integer.toString(i));
                }
                String output = storage[n - 1];
                System.out.println(output);
            }
            /*for(int i =1; i< storage.length ; i++)
            {
                System.out.println(i);
            }
            return storage;
        } else {
            return message;
        }
    }
}*/

