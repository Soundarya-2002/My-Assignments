package week2.day1;

public class IsPrime {
	public static void main(String[] args) {
		int n=7; // declare the value
		boolean prime=true;
		for(int i=2;i<n;i++) {  //to initialize the for loop 
			if(n%i==0) {  //  check if the iterator variable is not equal to 0 value
				prime=false;
				break;
			}
		}
		System.out.println(prime);  // to print the prime
	}
}
			
  
        

