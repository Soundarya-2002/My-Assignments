package CollectionsAssPrgm;

import java.util.HashSet;
import java.util.Set;;

public class PrintUniqueCharacter {
	public static void main(String[]args)
	{
		String text="soundarya";
		
		//convert string to charArray
        char[] CharArray=text.toCharArray();
		
		//create a new set
		Set<Character>val=new HashSet<Character>();
		
	    for(char Name : CharArray )
		{
	    	//add each character to the set
			val.add(Name);
		}
		
		   System.out.println(val);
		
		}

}
