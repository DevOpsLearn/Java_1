package myStatClasses;

public class Controller {

	public static void main(String[] args) {
		
		// get list of numbers
		int[] numbers = {1,9,2,8,3,7,5};
		
		// create an Averager object and give it to the list
		Averager avg = new Averager(numbers);
		
		// Use Averager object to get the average
		System.out.println(avg.toString());
		
		avg.setNumbers(11,0);
		System.out.println(avg.toString());
		

	}

}
