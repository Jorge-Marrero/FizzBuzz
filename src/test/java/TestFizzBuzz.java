import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class TestFizzBuzz {
    private FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void MultipleOf3(){
        assertThat(fizzBuzz.of(3)).isEqualTo("Fizz");
        assertThat(fizzBuzz.of(6)).isEqualTo("Fizz");
    }

    @Test
    public void MultipleOf5(){
        assertThat(fizzBuzz.of(5)).isEqualTo("Buzz");
        assertThat(fizzBuzz.of(10)).isEqualTo("Buzz");
    }

    @Test
    public void MultipleOf15(){
        assertThat(fizzBuzz.of(15)).isEqualTo("FizzBuzz");
        assertThat(fizzBuzz.of(30)).isEqualTo("FizzBuzz");
    }

    @Test
    public void AnyOtherNumber(){
        assertThat(fizzBuzz.of(1)).isEqualTo("1");
        assertThat(fizzBuzz.of(2)).isEqualTo("2");
    }
}
