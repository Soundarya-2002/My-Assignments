package org.system;

public class Desktop extends computer{
		public void DesktopSize() 
		{
			System.out.println("280×720");
		}
	public static class mainclass{
	public static void main (String[] args) 
	{
		Desktop D=new Desktop();
		D.computerModel();
		D.DesktopSize();
	}
	 
	}
}
