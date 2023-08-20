package CollectionsAssPrgm;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargestNum 
{
	public static void main(String[]args)
	{
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		
		//create a empty set
		Set<Integer> num=new TreeSet<Integer>();
		
		//Declare for loop iterator from 0 to data.length and add into Set 
		for(int i=0;i<data.length;i++)
		{
			num.add(data[i]);
		}
		
		//converted Set into List
		List<Integer>num2=new ArrayList<Integer>(num);
		System.out.println(num2);
		
		//print first largest number
		System.out.println("SecondLargestNumber= "+num2.get(num2.size()-2));
		
	}
	
}
