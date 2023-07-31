package week2.day1;

public class Fibonacci {
public static void main(String[] args) {
	//0  1  1  2  3  5  8  13  21  34  55  89  144
    int FirstNum=0;     // assign integer values
	int SecNum=1;   
	int count=11;
	int ThirdNum;
	System.out.print(FirstNum+" "+SecNum);  //print FirstNum,SecNum
	for(int i=2;i<count;++i)        // initiate loop for first 10 numbers
	{
	 ThirdNum=FirstNum+SecNum;  //0+1=1  
	  System.out.print( " "+ThirdNum);    
	  FirstNum=SecNum;         
	  SecNum=ThirdNum;  
	}
}
}


