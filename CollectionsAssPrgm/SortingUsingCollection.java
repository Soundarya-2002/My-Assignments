package CollectionsAssPrgm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {
	public static void main(String[]args)
	{
		//String text= "HCL Wipro,  Aspire Systems, CTS"
		
		List<String>name=new ArrayList<String>();
		name.add("Hcl");
		name.add("Wipro");
		name.add("Aspire System");
		name.add("CTS");
		
		System.out.println(name);
		
		//get the size of the value
		System.out.println(name.size());
		
		//sort the array
		Collections.sort(name);
		System.out.println(name);
		
		Collections.reverse(name);
		System.out.println(name);
	
		}

}
