package week2.day1;
import java.util.Arrays;
public class MissingElement {
	public static void main(String[] args) {
		// Here is the input
		int[] arr = {1,2,7,6,8,3,4};
		//1,2,3,4,6,7,8
		//Missing element
		// Sort the array	
		Arrays.sort(arr);

		// loop through the array (start i from 0 till the length of the array)
		for(int i=0;i<arr.length;i++){

		// check if the iterator variable is not equal to the array values respectively
					
		if(arr[i]!=i+1){
		// print the number
			System.out.println(i+1);
		// once printed break the iteration
			//break;
	}
	}
	}
	}
