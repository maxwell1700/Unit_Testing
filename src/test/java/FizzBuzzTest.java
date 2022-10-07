import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {


    @Test
    public void fizzBuzzTest(){
        Assert.assertEquals("fizzbuzz", FizzBuzz.fizzBuzz(15));
    }
}
