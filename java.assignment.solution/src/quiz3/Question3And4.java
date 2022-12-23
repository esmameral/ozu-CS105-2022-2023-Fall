package quiz3;

public class Question3And4 {

	public static void main(String[] args) {
				try {
					myMethod();
				}catch (MyException2 e) {
					System.out.println("A");
				}catch (Exception e) {
					e.printStackTrace();
					System.out.println("B");
				}
				finally {
					System.out.println("C");
				}
			
	}
	
	public static void myMethod() throws MyException2  {
		String ab=null;
		//System.out.println(ab.toUpperCase());
		int a=2;
		if(a==2)
			throw new MyException2();
		else if(a==2)
			throw new MyException2();
//		else
//			throw new Exception();
	}

}
