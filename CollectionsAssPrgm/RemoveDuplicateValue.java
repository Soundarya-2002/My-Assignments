package CollectionsAssPrgm;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateValue {
	public static void main(String[]args)
	{
		String text = "We learn java basics as part of java sessions in java week1";
		
		//split the text
		String[] split=text.split(" ");
		
		//create a empty set
		Set<String> val=new LinkedHashSet<String>();
		
		//iterate the values from split array
		for(String unique : split)
		{
			//add the words in set
			val.add(unique);
		}
		
		 //print the unique words
		 System.out.println(val);
		
	}

}
