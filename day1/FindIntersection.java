package week2.day1;

public class FindIntersection {
	public static void main(String[] args) {
		//Declare Array 
		int[] num1= {1,5,7,8,6,3};
		int[] num2 = {1,2,8,4,9,7};
		int length = num1.length;
		int length2= num2.length; 
		for(int i=0;i<length;i++) {    // declare for loop iterate from 0 to Array length 
			for(int j=0;j<length2;j++)      //length=property
				if(num1[i]==num2[j]) {    // to compare both array
				System.out.println(num1[i]);  // print the first array
				}
				
			}
		}
	}
