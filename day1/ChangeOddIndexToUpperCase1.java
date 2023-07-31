package week2.day1;

public class ChangeOddIndexToUpperCase1 {
	public static void main(String[]args) {
	String text="testleaf";   //declare a String
	String Uppercase=text.toUpperCase();
	//testleaf->I/P
	//tEsTlEaF->O/P
	char[] charArray=text.toCharArray();
	  // convert the String into Character
	  //[t,e,s,t,l,e,a,f]
	  //Iterate the character from charArray
	for(int i=0;i<charArray.length;i++) {
	  //check index value
		if(i%2==1) {
		  //t%2==0
		   //if it is satisfaction that condition it will change the character into Uppercase
			char oddIndex=Character.toUpperCase(charArray[i]);
			System.out.println(oddIndex);
		}
		else {
			System.out.println(charArray[i]);
		}
	}
	
}


}
