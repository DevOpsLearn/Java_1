package myStatClasses;

public class Averager {
	
	// instance variables
	int[] numbers;
	
	// methods
		// constructors
		Averager(){
			this.numbers = new int[7];
		}
		
		Averager(int[] numbers) {
			this.numbers = numbers;
		}
		
		// getters and setters
		
		public int[] getNumbers() {
			return this.numbers;
		}
		
		public void setNumbers(int[] numbers) {
			this.numbers = numbers;
		}
		
		public int getNumbers(int index) {
			return this.numbers[index];
		}
		
		public void setNumbers(int number,int index) {
			this.numbers[index] = number;
		}
		
		// custom methods
		
		public int getSum() {
			int sum = 0;
			
			for (int i=0; i < this.numbers.length; i++) {
				sum += this.numbers[i];
			}
			return sum;
		}
		
		public int getCount() {
			return (this.numbers.length);			
		}
		
		public double getAverage() {
			return this.getSum()/this.getCount();
		}
		
		public String toString() {
			String msg = "";
			msg += "Sum = " + this.getSum() + "\n";
			msg += "Count = " + this.getCount() + "\n";
			msg += "Average = " + this.getAverage() + "\n";
			return msg;
		}

}
