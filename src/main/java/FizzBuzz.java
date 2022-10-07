public class FizzBuzz {

    public static String fizzBuzz(int val)
    {
        return val % 5 == 0 && val % 3 == 0 ? "fizzbuzz" : null;
    }

    public String fizz(int val)
    {
        return val % 5 == 0 ? "fizz" : null;
    }
    public String buzz(int val)
    {
        return val % 3 == 0 ? "buzz" : null;
    }
}
