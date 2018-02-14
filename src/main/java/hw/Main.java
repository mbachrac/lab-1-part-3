package hw;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
            List<String> PrintList=Main.fizzBuzzArray(number);
        int listSize = PrintList.size ();
        for (int position = 0 ; position < listSize ; position++)
            System.out.println (PrintList.get(position));

    }


    public static List<String> fizzBuzzArray(final int n)
    {
        List<String> FizzBuzz;
        FizzBuzz=new ArrayList<String>();
        if (n < 1)
        {
            FizzBuzz.add("Your number is not a valid array length.");
        }
        else
        {
            for (int i = 1; i <= n; i++) {
                if ((i % 3 == 0) && (i % 5 == 0))
                    FizzBuzz.add("Fizz Buzz");
                else if (i % 3 == 0)
                    FizzBuzz.add("Fizz");
                else if (i % 5 == 0)
                    FizzBuzz.add("Buzz");
                else
                    FizzBuzz.add (Integer.toString(i));
            }
        }

        return FizzBuzz;
    }
}