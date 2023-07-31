package week2.day1;

public class FindTheMinimumValueInArray {
	public static void main(String[] args) {
		int[] num= {10,20,13,54,97};  //to declare the variable
		int maxValue=Integer.MAX_VALUE;
		System.out.println(maxValue);  //print the maxValue
		int length=num.length;
		for(int i=0;i<num.length;i++) {  // iterate for loop 
			if(num[i]<maxValue) {
				maxValue=num[i];
			}
			System.out.println(maxValue);
		
		}
		
	}

}
