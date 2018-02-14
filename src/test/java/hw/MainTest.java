package hw;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class MainTest
{

    @Test
    public void fizzBuzzTestSeven()
    {
        String[] expected7={"1","2","Fizz","4","Buzz","Fizz","7"};
        ArrayList<String> list7 = new ArrayList<>();
        list7.addAll(Arrays.asList(expected7));
        assertEquals(list7, Main.fizzBuzzArray(7));
    }

    @Test
    public void fizzBuzzTestOne()
    {
        String[] expected1={"1"};
        ArrayList<String> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(expected1));
        assertEquals(list1,Main.fizzBuzzArray(1) );
    }
    @Test
    public void fizzBuzzTestSeventeen()
    {
        String[] expected17={"1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","Fizz Buzz","16","17"};
        ArrayList<String> list17 = new ArrayList<>();
        list17.addAll(Arrays.asList(expected17));
        assertEquals(list17,Main.fizzBuzzArray(17) );
    }
    @Test
    public void fizzBuzzTestNegTen()
    {
        String[] expectedNeg10={"Your number is not a valid array length."};
        ArrayList<String> listNeg10 = new ArrayList<>();
        listNeg10.addAll(Arrays.asList(expectedNeg10));
        assertEquals(listNeg10,Main.fizzBuzzArray(-10) );
    }
    @Test
    public void fizzBuzzTestNegOne()
    {
        String[] expectedNeg1={"Your number is not a valid array length."};
        ArrayList<String> listNeg1 = new ArrayList<>();
        listNeg1.addAll(Arrays.asList(expectedNeg1));
        assertEquals(listNeg1,Main.fizzBuzzArray(-1) );
    }
    @Test
    public void fizzBuzzTestZero()
    {
        String[] expectedZero={"Your number is not a valid array length."};
        ArrayList<String> listZero = new ArrayList<>();
        listZero.addAll(Arrays.asList(expectedZero));
        assertEquals(listZero,Main.fizzBuzzArray(0) );
    }
}