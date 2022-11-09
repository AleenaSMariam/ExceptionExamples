package exceptionexample;

public class ExceptionEx {
	public void add(int n1,int n2) {
		int res;
		try {
		int arr[]=new int[5];
		res=n1/n2;
		System.out.println("Result= "+res);
		for(int i=0;i<=5;i++) {
			arr[i]=i+1;
			System.out.println(arr[i] );
		}
		
		}
		catch (ArithmeticException a) {
			System.out.println("Exception-Division by zero is not possible");
		}
		catch(ArrayIndexOutOfBoundsException ar) {
			System.out.println("Exception-Size of array is 5");
		}
		catch(Exception e) {
			System.out.println("Exception occured");
		}
		finally {
			System.out.println("Finnaly Block");
		}
	}
	
	public static void main(String[] args) {
		ExceptionEx obj=new ExceptionEx();
			obj.add(20, 10);

	}

}
