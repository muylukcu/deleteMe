import java.util.Arrays;
import java.util.Random;

public class RandomNumbers {

	public static void main(String[] args) {
		
		Random rand = new Random();
		int[] days = new int[8];
		for (int i = 0; i < days.length; i++) {
			days[i] = rand.nextInt(7) ; 
		}	
		System.out.println(days);
		
		String str = Arrays.toString(days);
		System.out.println(str);
//		
//		for (int day : days) {
//			System.out.print( day + " ");
//		}
		
		
		

	}

}
