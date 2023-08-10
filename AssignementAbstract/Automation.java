package AssignementAbstract;

public class Automation extends MultipleLanguage 
{
		
	public void Java() {
		// TODO Auto-generated method stub
		System.out.println("Java");
	}

	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("Selenium");
	}
	

		@Override
		public void Ruby() {
			// TODO Auto-generated method stub
			System.out.println("Ruby");
		}

         public static void main(String[]args) {
	       Automation A=new Automation();

                A.Java();
                A.Selenium();
                A.Ruby();
                A.Python();

}
}
