package CollectionsAssPrgm;

public class FindMissingNumber 
{

    public static void main(String[]args)
	{
	  
		int[]arr={1,3,2,5,6,9,4,10,7};

		int n=arr.length+1;                  //8+1=9  
		int sum= n*(n+1)/2;                   //9*(10)/2= 45   sum=45      
		int num=0;
		for(int i=0;i<arr.length;i++)         //iterate the loop end 9
		{
			num=(num+arr[i]);                 //start from  0+1=1 ,num=1,1+2=3. end with 28+9=37  num=37
		}
		int S=sum-num;    //10-  6               //45-37=8 so missing num=8
		System.out.println("Missing num= "+S);
	}	
	}

   
   