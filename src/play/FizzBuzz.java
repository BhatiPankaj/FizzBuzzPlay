package play;

public class FizzBuzz {
	public String fizzBuzzPlay(int number){
		
		if(number >= 1 && number <= 100 ) {
			if(number%5 == 0 && number%3 == 0) {
				return "FizzBuzz";
			}
			else if(number%3 == 0) {
				return "Fizz";
			}
			else if(number%5 == 0) {
				return "Buzz";
			}
			else
				return String.valueOf(number);
		}
		else {
			return "Number is not in Range";
		}
	}
}
