import java.util.Random;

public class WarmUpTask {

	public static void main(String[] args) {

		// create an array of 8 items with random numbers between 0 to 6
		//int[] days = { 4, 5, 0, 2, 6, 6, 3, 1 };
		int[] days = new int[8];
		int count = 0 ; 
		Random rand = new Random();
		for (int i = 0; i < days.length; i++) {
			days[i] = rand.nextInt(7) ; 
		}
		// use for each loop to loop through each and every item
		// and print output as below
		// Task 1
		// if it's 0 print Sunday if 1 Monday if 2 Tuesday .... if 6 Saturday
		// Task 2
				// find the count of weekends
		
		for (int day : days) {
			
			// System.out.println(day);
			switch (day) {
				case 0:
					System.out.println("Sunday");
					count++ ; 
					break;
				case 1:
					System.out.println("Monday");
					break;
				case 2:
					System.out.println("Tuesday");
					break;
				case 3:
					System.out.println("Wednesday");
					break;
				case 4:
					System.out.println("Thursday");
					break;
				case 5:
					System.out.println("Friday");
					break;
				case 6:
					System.out.println("Saturday");
					count++ ; 
					break;
				default:
					System.out.println("Unknown day");

			}
		}
		System.out.println("we have "+count +" weekend days");

		

	}

}
