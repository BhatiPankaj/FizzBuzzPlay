package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import play.FizzBuzz;

public class FizzBuzzTest {
	private FizzBuzz fizzy;
	private String fizz = "Fizz";
	
	@Before
	public void setup() {
		fizzy = new FizzBuzz();
	}
	
	@Test
	public void numberIsNotMultipleOf_3or5(){
		Assert.assertEquals("1", fizzy.fizzBuzzPlay(1));
		Assert.assertEquals("2", fizzy.fizzBuzzPlay(2));
		Assert.assertEquals("7", fizzy.fizzBuzzPlay(7));
		Assert.assertEquals("8", fizzy.fizzBuzzPlay(8));
		Assert.assertEquals("13", fizzy.fizzBuzzPlay(13));
	}
	
	@Test
	public void numberIsMultipleOf_3() {
		Assert.assertEquals(fizz, fizzy.fizzBuzzPlay(3));
		Assert.assertEquals(fizz, fizzy.fizzBuzzPlay(6));
	}
}
