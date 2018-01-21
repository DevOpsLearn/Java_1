package mypackage;

public class AverageController {

	public static void main(String[] args){
		
		//0. create and initialize variables
		double avg = 0.0;
		int sum = 0;
		int count;
		count = 0;
		
		//1. get the numbers
		int[] numbers1 = {5,1,9,0,10,3,7};
		int[] numbers2 = {4,1,7,3,5,6,2};
		int[] numbers3 = {3,1,5,2,4};
		
		AverageController ac = new AverageController();
		//2. Sum the numbers
		sum = ac.getSum(numbers1);
				
		//3. Count the numbers
		count = ac.getCount(numbers1);
				
		//4. Get Average
		avg = ac.getAvg(sum, count);
		
		//5. Output the results
		ac.getResults(sum,count,avg);
		
		/******************************/
		
		//2. Sum the numbers
		sum = ac.getSum(numbers2);
						
		//3. Count the numbers
		count = ac.getCount(numbers2);
						
		//4. Get Average
		avg = ac.getAvg(sum, count);
				
		//5. Output the results
		ac.getResults(sum,count,avg);

/******************************/
		
		//2. Sum the numbers
		sum = ac.getSum(numbers3);
						
		//3. Count the numbers
		count = ac.getCount(numbers3);
						
		//4. Get Average
		avg = ac.getAvg(sum, count);
				
		//5. Output the results
		ac.getResults(sum,count,avg);
					
		
		
	}
	
	public int getSum(int[] arr) {
		int sum = 0;
		for (int i=0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;		
	}
	
	public int getCount(int[] arr) {
		int count =  arr.length;
		return count;
	}
	
	public double getAvg(int sum,int count) {
		double Avg = 0.0;
		Avg = sum/count;
		return Avg;
	}
	
	public void getResults(int sum, int count, double Avg) {
		System.out.println("Sum = " + sum);
		System.out.println("Count =" + count);
		System.out.println("Average = " + Avg);
	}



}

