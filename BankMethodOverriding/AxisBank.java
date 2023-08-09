package BankMethodOverriding;

public class AxisBank extends BankInfo {
      public void Deposit() {
    	  System.out.println("AxisBank Deposit");
      }
  public static void main(String[]args) {
	  AxisBank Bank=new AxisBank();
	  Bank.Deposit();
	  Bank.Saving();
	  Bank.Fixed();
  }
}
  
