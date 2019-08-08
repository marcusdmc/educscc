package home;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FizzBuzzTest {
    @Test
    public void doYouFizzOrBuzz(){
        FizzBuzz fizzBuzz = new FizzBuzz(20);
        assertEquals("buzz",fizzBuzz.calculateFizzOrBuzz());
    }

}
