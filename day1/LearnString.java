package week2.day1;

public class LearnString {
	public static void main(String[] args) {
		String text="Sowmya";
		//to get the size of given String
		 int length= text.length();
		 System.out.println(length);           
		 char[] charArray=text.toCharArray(); 
		 //toChar method() store into charArray
         //iterate the value from charArray
		 //convert the string into character
		 for(int i=0;i<charArray.length;i++) {  
			 System.out.print(charArray[i]);
		 }
		 System.out.println();
		 for(int j=charArray.length-1;j>=0;j--) {  
			 System.out.print(charArray[j]);
		 
	}
	}
	
}
