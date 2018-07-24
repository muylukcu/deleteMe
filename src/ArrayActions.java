import java.util.Arrays;

public class ArrayActions {

	public void some(){
		System.out.println("local");

	public static void main(String[] args) {
		
		// sorting an array using Arrays.Sort(yourArray)
		long[] longs = {1,77,4,55} ; 
		Arrays.sort(longs); /// 1,4,55,77
		
		// search an array item using Arrays.binarySearch(yourArray,itemToLookFor)
		int indexOf77 =  Arrays.binarySearch(longs, 77);
		System.out.println("index of 77 is "+ indexOf77);

		
		String str = Arrays.toString(longs) ;
		System.out.println( str );		
		// create an double array and print out value using Arrays.toString(your array)

	}

}
