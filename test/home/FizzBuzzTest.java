package home;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FizzBuzzTest {
    @Test
    public void doYouFizz(){
        FizzBuzz fizzBuzz = new FizzBuzz(12);
        assertEquals("fizz",fizzBuzz.calculateFizzOrBuzz());
    }

    @Test
    public void doYouBuzz(){
        FizzBuzz fizzBuzz = new FizzBuzz(20);
        assertEquals("buzz",fizzBuzz.calculateFizzOrBuzz());
    }

    @Test
    public void doYouFizzBuzz(){
        FizzBuzz fizzBuzz = new FizzBuzz(30);
        assertEquals("fizzbuzz",fizzBuzz.calculateFizzOrBuzz());
    }

    @Test
    public void doYouNotFizzOrBuzz(){
        FizzBuzz fizzBuzz = new FizzBuzz(17);
        assertEquals(String.valueOf(17),fizzBuzz.calculateFizzOrBuzz());
    }




}
