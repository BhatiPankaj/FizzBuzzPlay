package play;

public class FizzBuzz {
	public String fizzBuzzPlay(int number){
		
		if(number%3 == 0) {
			return "Fizz";
		}
		else
			return String.valueOf(number);
	}
}
